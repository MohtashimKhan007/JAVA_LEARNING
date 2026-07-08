package in.Strikes.crudSpringBootDemo.controller;

import in.Strikes.crudSpringBootDemo.dto.CreateStudentRequestDto;
import in.Strikes.crudSpringBootDemo.dto.CreateStudentResponseDto;
import in.Strikes.crudSpringBootDemo.dto.UpdateStudentRequestDto;
import in.Strikes.crudSpringBootDemo.dto.UpdateStudentResponseDto;
import in.Strikes.crudSpringBootDemo.entity.Student;
import in.Strikes.crudSpringBootDemo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    //Create Student

    // student controller only have the work to manage the request now we have to move this to the service layer that is StudentService
    // so that the service layer can perform the operations on that  for that -> we have created the object of the Student Service
    // for that we have to use the dependency injection  for that ->we use the constructor injection
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping("/create")
    // if we have to send our own response code  by default ok so we use the Response Entity instead of student in return type
    public ResponseEntity<CreateStudentResponseDto> createStudent(
            @Valid
            @RequestBody CreateStudentRequestDto studentRequestDto){
        // here we are called the method createStudent of the studentService class

       CreateStudentResponseDto createdStudent =  studentService.createStudent(studentRequestDto);

       return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    //read one Student
    @GetMapping("/get")
    public ResponseEntity<CreateStudentResponseDto> getStudent(@RequestParam Long id){
        CreateStudentResponseDto studentResp = studentService.getStudent(id);
        if(studentResp==null){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentResp);

    }
    // get all students

    @GetMapping("/getAll")
    public ResponseEntity<List<CreateStudentResponseDto>> getAllStudent(){
        List<CreateStudentResponseDto> studentList = studentService.getAllStudent();
        if(studentList.isEmpty()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);

    }

    //update


    @PutMapping("/update")
    public ResponseEntity<UpdateStudentResponseDto> updateStudent(@RequestParam Long id,@RequestBody UpdateStudentRequestDto studentReq){
        UpdateStudentResponseDto studentResp = studentService.updateStudent(id,studentReq);
        if(studentResp==null){

            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentResp);

    }

    //Delete

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id){
       Boolean isDeleted =  studentService.deleteStudent(id);
       if(!isDeleted){
       return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok("Record Deleted");
    }

    // soft Delete
    @PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        Boolean isDeleted = studentService.deleteStudentSoftly(id);

        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");

    }


}

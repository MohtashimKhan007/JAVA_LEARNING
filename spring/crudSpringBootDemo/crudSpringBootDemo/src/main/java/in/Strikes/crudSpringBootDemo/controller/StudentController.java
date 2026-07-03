package in.Strikes.crudSpringBootDemo.controller;

import in.Strikes.crudSpringBootDemo.entity.Student;
import in.Strikes.crudSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
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
    public ResponseEntity<Student > createStudent(@RequestBody Student student){
        // here we are called the method createStudent of the studentService class

       Student createdStudent =  studentService.createStudent(student);

       return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    //read one Student
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentResp = studentService.getStudent(id);
        if(studentResp==null){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentResp);

    }
    // get all students

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        if(studentList.isEmpty()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);

    }

    //update


    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student studentReq){
        Student studentResp = studentService.updateStudent(id,studentReq);
        if(studentResp==null){

            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentResp);

    }

    //Delete

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
       Boolean isDeleted =  studentService.deleteStudent(id);
       if(!isDeleted){
       return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok("Record Deleted");
    }




}

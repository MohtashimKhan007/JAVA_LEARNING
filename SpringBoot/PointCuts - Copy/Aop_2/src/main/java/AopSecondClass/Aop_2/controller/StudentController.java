package AopSecondClass.Aop_2.controller;


import AopSecondClass.Aop_2.Service.StudentService;
import AopSecondClass.Aop_2.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student>createStudent(@RequestBody Student student){
        Student s = studentService.createStudent(student);
      return ResponseEntity.ok(s);
    }

    @GetMapping
    public ResponseEntity<String> getStudent() throws InterruptedException {
        String s  = "All Student data";
       return ResponseEntity.ok(studentService.getStudent(s));
    }


}

package HibernateDemo.demo.controller;

import HibernateDemo.demo.model.Student;
import HibernateDemo.demo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok("Done");
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@RequestBody Student student,@PathVariable  Long id){
        studentService.updateStudent(student,id);
        return ResponseEntity.ok("Done");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Done");
    }

}

package practiceApi.practiceApi.controller;

import org.springframework.web.bind.annotation.*;
import practiceApi.practiceApi.Model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();
    @GetMapping("/Student")
    public String getStudent(){
        return "Hello Student";
    }
    // post Student

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("/students")
    public List<Student> getallStudents(){
        return students;
    }
//    Get sudent by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        for(Student student : students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }


//    put  student by id  -> put -> means update
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable  int id,@RequestBody  Student updatedStudent){
        for(Student student : students){
            if(student.getId()==id){
              student.setName(updatedStudent.getName());
              return student;
            }
        }
        return null;
    }

    //delete student by id

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
//                           students -> List         this student will Iterates on every value
        boolean isRemoved = students.removeIf(student -> student.getId()==id);

        if(isRemoved){
            return "Student with id  "+ " " + id +"  deleted Successfully";
        }
        else {
            return "Student not Found";
        }
    }


}

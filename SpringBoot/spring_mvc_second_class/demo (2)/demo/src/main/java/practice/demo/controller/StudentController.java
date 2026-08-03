package practice.demo.controller;

import org.springframework.web.bind.annotation.*;
import practice.demo.playload.example.Department;
import practice.demo.playload.example.DummyDataGenerator;
import practice.demo.playload.example.Student;
import practice.demo.playload.example.Subjects;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {



    //getting single student
    @RequestMapping("/single")
    public Student getStudent(){



        //creating the Department
        Department department = new Department();
        department.setDepartmentCode("CS");
        department.setDepartmentName("Computer Science");

        //Creating Subjects

        Subjects subject1 = new Subjects();
        subject1.setSubjectCode("KVCM567");
        subject1.setTitle("Data Structure");


//        creating one more Subject
        Subjects subject2 = new Subjects();
        subject2.setSubjectCode("MTH");
        subject2.setTitle("Mathematics");

//        Now creating a List to Store these Subjects
        List<Subjects> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);




//        Creating the Student
        Student student =  new Student();
        student.setName("Mohtashim");
        student.setAge(22);

        // in order to give department we have to first create the department Because student class does not have Department

        student.setDepartment(department);
        student.setSubjects(subjects);
        return student;




    }

    @GetMapping("/all")
    public List<Student> getStudents(){
        List<Student> students = DummyDataGenerator.generateDummyStudents();
        return students;

    }


    @RequestMapping("/wish/{message}/for/{Username}")
    public String wish(@PathVariable String message,@PathVariable String Username){
        return "Wishing "+ message +  " for " + Username;
    }

//    query parameter

    @RequestMapping("/wish")
    public String wishQuery(@RequestParam(value = "message") String message, @RequestParam String Username){
        return "Wishing "+ message +  " for " + Username;
    }
}



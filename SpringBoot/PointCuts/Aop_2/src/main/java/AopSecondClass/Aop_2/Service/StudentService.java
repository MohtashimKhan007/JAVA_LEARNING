package AopSecondClass.Aop_2.Service;


import AopSecondClass.Aop_2.dto.Student;
import jdk.jfr.Timestamp;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public  Student createStudent(Student student ){
        System.out.println("Student Saved");
        return student;

    }
    public String getStudent(String s){
        System.out.println(s);
        return s;

    }
}

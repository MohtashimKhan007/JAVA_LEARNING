package AopSecondClass.Aop_2.Service;


import AopSecondClass.Aop_2.annotation.TrackExecutionTime;
import AopSecondClass.Aop_2.dto.Student;
import jdk.jfr.Timestamp;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @TrackExecutionTime(
            warnAfter = 2000,
            operation = "Creating new Student"
    )
    public  Student createStudent(Student student ){
        System.out.println("Student Saved");
        return student;

    }


    @TrackExecutionTime(
            warnAfter = 1500,
            operation = "Get Student data"
    )
    public String getStudent(String s) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(s);
        return s;

    }
}

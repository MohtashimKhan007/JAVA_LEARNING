package AopSecondClass.Aop_2.Service;


import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public  String createStudent( ){
        System.out.println("Student Saved");

        throw  new RuntimeException("Some error happened");

//        try {
//            throw new RuntimeException("some error occured");
//        }
//        catch(RuntimeException e){}
//        return "student";

    }
    public String dummyMethod(String s){
     return s;
    }
}

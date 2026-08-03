package in.strikes.filterDemo.service;


import in.strikes.filterDemo.dto.Student;
import in.strikes.filterDemo.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentResponseDto createStudent(Student student){
//        System.out.println("Student Created");
//        System.out.println(student.getName());
//        System.out.println(student.getMail());

        StudentResponseDto responseDto = new StudentResponseDto();
        responseDto.setName(student.getName());
        responseDto.setMessage("Student is Saved Successfully");
        return responseDto;


//        try{
//            Thread.sleep(3000);
//        }
//        catch (Exception e){
//
//        }
    }

}

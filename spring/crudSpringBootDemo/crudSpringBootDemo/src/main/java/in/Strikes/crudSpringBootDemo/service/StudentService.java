package in.Strikes.crudSpringBootDemo.service;

import in.Strikes.crudSpringBootDemo.dto.CreateStudentRequestDto;
import in.Strikes.crudSpringBootDemo.dto.CreateStudentResponseDto;
import in.Strikes.crudSpringBootDemo.dto.UpdateStudentRequestDto;
import in.Strikes.crudSpringBootDemo.dto.UpdateStudentResponseDto;
import in.Strikes.crudSpringBootDemo.entity.Student;
import in.Strikes.crudSpringBootDemo.exception.ResourceNotFoundException;
import in.Strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    // StudentService fo the -> business logic
    // then we send this to the repository for storing this into the database so for that
    // we have to do the same here also



    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository  = studentRepository;
    }
    // we have to return the student Response dto
    public CreateStudentResponseDto createStudent(CreateStudentRequestDto studentReqDto){

        // calling saveStudent method of the student Repository
        // here we have called the save method that is inside the jpa repository . we don't need to
        // overwrite that all the things is being done by jpa during runtime
//        studentReq.setDeleted(false);
//       Student studentRes =  studentRepository.save(studentReq);
//
//       return studentRes;
   // This map to entity will map the request dto to the entity
        Student student = mapToEntity(studentReqDto);
        // we have to store the time of created at and updated at
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
       Student studentResp =  studentRepository.save(student);
       // we have to written only those fields which user give in the req becuase we dont want to show the internal things to the user for that
        // we have to create the response dto
        // we have to return the response dto to the user
        return  mapToDto(studentResp);
        // now we have to create these methods map to entity and dto so we create on this same page in last

    }
    public CreateStudentResponseDto getStudent(Long id){
        // magic happen we just give the name as findByIdAndDeletedFalse and declare this in student Repository it will automatically implement it internally

       // we will not do like this we can generally make the obj of student and use or else method
//        Optional<Student> studentResp = studentRepository.findById(id);
        // we will not handle the exception like this we will handle this in global exception class
//        if(studentResp.isPresent()){
//            return mapToDto(studentResp.get());
//        }
//        return null;
          // this is returning the value of optional type means there can or cannot be a value
        // suppose if there is no value so this will give the exception -> no such element
        // compiler will check will the current method is handling that
        // here no so it will propagate to its parent
        // and this method getStudent is called by student Controller
        // but there is no method inside the student controller to handle this exception so this exception will go to the client
        // and that exception will be in proper format because spring boot has default exceptional handling method
        // before going this exception from the controller to the client spring mvc will do this

//        return mapToDto(studentResp.get());

        // we will do like this ->
//        Student studentResp = studentRepository
//                .findById(id)
//                .orElse(null); // we will not return null we will return   resource not found exception for that we have to create the class resource not found
//

        // wo we will do like this ->
        Student studentResp = studentRepository
                .findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student with id " + id + " not found"));
        // here if we do map toDto(studentResp) this will call runtime exception if the value is null and that will be handled by the runtime exception  -> the global exception class
        return mapToDto(studentResp);
    }

    // get al student method and we have also used the soft delete by just giving name like this and declaring in the student Repository
    public List<CreateStudentResponseDto> getAllStudent(){
        List<Student> studentList = studentRepository.findByDeletedIsFalse();

        return studentList.stream().map(this::mapToDto).toList();
    }

    // update student -> here we get id to check if that exist or not and the body
    public UpdateStudentResponseDto updateStudent(Long id, UpdateStudentRequestDto studentReq){
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedFalse(id);

        if(existingStudent.isEmpty()){
            return null;
        }

        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setAge(studentReq.getAge());
         studentToSave.setDeleted(false);
         studentToSave.setUpdatedAt(LocalDateTime.now());
         Student savedStudent = studentRepository.save(studentToSave);
         return mapToUpdateDto(savedStudent);


    }


    //delete student method
    public boolean deleteStudent(Long id){
      boolean isStudent =   studentRepository.existsById(id);
      if(!isStudent) return false;
      studentRepository.deleteById(id);
      return true;
    }

     // soft delete
    public boolean deleteStudentSoftly(Long id){
        // get the record
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedFalse(id);
        if(existingStudent.isEmpty()){
            return false;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setDeleted(true);
        studentRepository.save(studentToSave);
        return true;
        // set is deleted as 1
        //save
    }

  private  Student mapToEntity(CreateStudentRequestDto studentReqDto){
        Student student = new Student();
        student.setName(studentReqDto.getName());
        student.setAge(studentReqDto.getAge());
        student.setEmail(studentReqDto.getEmail());
        student.setSubject(studentReqDto.getSubject());
        student.setDeleted(false);
        return student;
  }

  private CreateStudentResponseDto mapToDto(Student student){
   CreateStudentResponseDto responseDto = new CreateStudentResponseDto();
   responseDto.setId(student.getId());
   responseDto.setName(student.getName());
   responseDto.setAge(student.getAge());
   responseDto.setEmail(student.getEmail());
   responseDto.setSubject(student.getSubject());
   responseDto.setMessage("Student Saved Successfully");
   responseDto.setCreatedAt(student.getCreatedAt());
   responseDto.setUpdatedAt(student.getUpdatedAt());

   return responseDto;

  }
  private UpdateStudentResponseDto mapToUpdateDto(Student student){
      UpdateStudentResponseDto responseDto = new UpdateStudentResponseDto();
      responseDto.setId(student.getId());
      responseDto.setName(student.getName());
      responseDto.setAge(student.getAge());
      responseDto.setEmail(student.getEmail());
      responseDto.setSubject(student.getSubject());
      responseDto.setMessage("Student Updated Successfully");
      responseDto.setUpdatedAt(student.getUpdatedAt());

      return responseDto;

  }

}

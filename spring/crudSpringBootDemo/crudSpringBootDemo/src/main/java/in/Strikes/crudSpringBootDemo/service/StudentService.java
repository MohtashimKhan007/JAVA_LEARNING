package in.Strikes.crudSpringBootDemo.service;

import in.Strikes.crudSpringBootDemo.entity.Student;
import in.Strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.Option;
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
    public Student createStudent(Student studentReq){

        // calling saveStudent method of the student Repository
        // here we have called the save method that is inside the jpa repository . we don't need to
        // overwrite that all the things is being done by jpa during runtime
       Student studentRes =  studentRepository.save(studentReq);

       return studentRes;

    }
    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;

    }

    // get al student method
    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    // update student -> here we get id to check if that exist or not and the body
    public Student updateStudent(  Long id,Student studentReq){
        Optional<Student> existingStudent = studentRepository.findById(id);
        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail((studentReq.getEmail()));
        studentToSave.setAge(studentReq.getAge());


         return studentRepository.save(studentToSave);


    }


    //delete student method
    public boolean deleteStudent(Long id){
      boolean isStudent =   studentRepository.existsById(id);
      if(!isStudent) return false;
      studentRepository.deleteById(id);
      return true;
    }



}

package in.Strikes.crudSpringBootDemo.repository;

import in.Strikes.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// we Have make this as interface because jpa is also an interface so we extend this by jpa
//< here we have to give two things one is whose Repository is this -> here this is student and the second is the data type of the primary key of the first value>
// if we make it class instead of interface then we have to manually write the queries
@Repository
// this is interface so no bean will be created of this  -> this can also work without using the @Repostiory
public interface StudentRepository  extends JpaRepository<Student,Long> {
Optional<Student> findByIdAndDeletedFalse(Long id);
List<Student> findByDeletedIsFalse();


}

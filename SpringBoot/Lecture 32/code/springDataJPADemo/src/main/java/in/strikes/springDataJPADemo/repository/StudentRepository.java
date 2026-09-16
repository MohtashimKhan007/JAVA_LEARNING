package in.strikes.springDataJPADemo.repository;

import in.strikes.springDataJPADemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface StudentRepository extends JpaRepository<Student,Long> {

    //if we extend only Repository(which does not have any method) then it just only work  as a marker
    //if we have to use methods  after extending Repository then we have to declare those methods here
//    like -> void save(Student student) we just have to declare these methods only


//    void save(Student student);
//
//    Optional<Student> findById(Long id);

    // Magic -> this will work -> even these methods like save and find by id does not exist but vo inke name se samajh gya
    // ki mujhe konsi query generate  hai
    // benefit of extending the Repository is that jo methods yaha pe declare krege sirf unko hi service layer pe use kr payege
    // crud Repostiory ko extend krege to vo return krti hai iterable and usse badhiya hai listCrudRepository that
    // will return the list
// pagingAndSorting Repository use -> if we have millions of records then by then help of this
// we divide the record in pages(chunks) and sorting is also used
//    @Query annotation se ham apni custom query bhi likh skte hai
}
package Pagination.and.Sorting.demo.repository;

import Pagination.and.Sorting.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee,Long> {

}

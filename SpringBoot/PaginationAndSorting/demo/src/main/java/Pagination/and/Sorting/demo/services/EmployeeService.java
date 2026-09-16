package Pagination.and.Sorting.demo.services;

import Pagination.and.Sorting.demo.model.Employee;
import Pagination.and.Sorting.demo.repository.employeeRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    employeeRepository employeeRepository;
    public EmployeeService(employeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> fetchAllEmployees(Pageable pageable){
        return employeeRepository.findAll(pageable).getContent();
    }
    //.getContent() convert the page into the list

    public Employee save(Employee employee){
       return employeeRepository.save(employee);

    }

}

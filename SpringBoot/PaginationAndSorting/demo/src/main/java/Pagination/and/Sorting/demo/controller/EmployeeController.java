package Pagination.and.Sorting.demo.controller;

import Pagination.and.Sorting.demo.model.Employee;
import Pagination.and.Sorting.demo.services.EmployeeService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
     EmployeeService employeeService;
     public EmployeeController(EmployeeService employeeService){
         this.employeeService = employeeService;
     }
     @PostMapping("/create")
     public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);

     }

     @GetMapping("/list")
    public List<Employee> getEmployee(@RequestParam(required = false, defaultValue = "1") int pageNumber,
                                      @RequestParam(required = false,defaultValue = "5") int pageSize,
                                      @RequestParam(required = false,defaultValue = "id") String sortBy,
                                      @RequestParam(required = false,defaultValue = "ASC") String sortDir){

         Sort sort = null;
         if(sortDir.equals("ASC")){
             sort = Sort.by(sortBy).ascending();
         }
         else{
             sort = Sort.by(sortBy).descending();
         }


         return employeeService.fetchAllEmployees(  PageRequest.of(pageNumber-1,pageSize,sort));
     }

}

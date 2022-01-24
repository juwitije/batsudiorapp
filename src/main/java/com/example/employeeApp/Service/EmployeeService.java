package com.example.employeeApp.Service;

import com.example.employeeApp.Domain.Employee;
import com.example.employeeApp.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private StudentRepository repo;

            public List<Employee> listAll(){
                return repo.findAll();
            }
            public  void save(Employee emp){
                repo.save(emp);
            }
            public Employee get(long id){
                return repo.findById(id).get();
            }
            public void delete(long id){
                repo.deleteById(id);
            }
}

package com.example.employeeApp.Repository;

import com.example.employeeApp.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Employee, Long> {
}

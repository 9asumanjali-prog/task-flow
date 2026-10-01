package com.Taskflow.task_flow.repository;
import com.Taskflow.task_flow.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    }


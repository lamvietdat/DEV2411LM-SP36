package com.example.devmaster.lab03.service;

import com.example.devmaster.lab03.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(1L, "Nguyen Van A", "Male", 30, 1000));
        employeeList.add(new Employee(2L, "Tran Thi B", "Female", 25, 1200));
        employeeList.add(new Employee(3L, "Le Van C", "Male", 28, 1100));
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeById(Long id) {
        return employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Long id, Employee updatedEmployee) {
        Optional<Employee> existingEmployee = employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();

        existingEmployee.ifPresent(emp -> {
            emp.setFullName(updatedEmployee.getFullName());
            emp.setGender(updatedEmployee.getGender());
            emp.setAge(updatedEmployee.getAge());
            emp.setSalary(updatedEmployee.getSalary());
        });
    }

    public void deleteEmployee(Long id) {
        employeeList.removeIf(emp -> emp.getId().equals(id));
    }
}

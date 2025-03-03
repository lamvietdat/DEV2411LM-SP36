package com.example.devmaster.lab04.service;


import com.example.devmaster.lab04.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(1L, "Nguyễn Văn A", "Male", 30, 1500));
        employeeList.add(new Employee(2L, "Trần Thị B", "Female", 25, 2000));
    }

    public List<Employee> getAll() {
        return employeeList;
    }

    public Optional<Employee> getById(Long id) {
        return employeeList.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public boolean update(Long id, Employee employee) {
        return getById(id).map(e -> {
            e.setFullName(employee.getFullName());
            e.setGender(employee.getGender());
            e.setAge(employee.getAge());
            e.setSalary(employee.getSalary());
            return true;
        }).orElse(false);
    }

    public boolean delete(Long id) {
        return employeeList.removeIf(e -> e.getId().equals(id));
    }
}

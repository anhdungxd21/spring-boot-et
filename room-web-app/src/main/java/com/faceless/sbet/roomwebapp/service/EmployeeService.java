package com.faceless.sbet.roomwebapp.service;

import com.faceless.sbet.roomwebapp.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private static final List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(UUID.randomUUID().toString(), "Adams", "Roy", "HOUSEKEEPING"));
        employees.add(new Employee(UUID.randomUUID().toString(), "Adams", "Martin", "SECURITY"));
        employees.add(new Employee(UUID.randomUUID().toString(), "Alvarez", "Roger", "FRONT_DESK"));
    }

    public List<Employee> getAllEmployee(){
        return employees;
    }
}

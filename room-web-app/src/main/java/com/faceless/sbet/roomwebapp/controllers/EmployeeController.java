package com.faceless.sbet.roomwebapp.controllers;

import com.faceless.sbet.roomwebapp.models.Employee;
import com.faceless.sbet.roomwebapp.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getEmployee(Model model) {
        model.addAttribute("employees", this.employeeService.getAllEmployee());
        return "employees";
    }
}

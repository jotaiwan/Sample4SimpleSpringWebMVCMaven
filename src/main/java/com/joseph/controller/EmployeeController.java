package com.joseph.controller;

import com.joseph.model.Employee;
import com.joseph.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jotaiwan on 8/07/2017.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public String all(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();

//        employeeService.deleteEmployeeBySsn("ssn00000002");
        model.addAttribute("employees", employees);
        return "employees";
    }
}

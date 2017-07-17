package com.joseph.controller;

import com.joseph.model.Employee;
import com.joseph.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("employees", employees);
        return "employee";
    }

    @RequestMapping(value="/edit/{employeeId}" )
    public String edit(@PathVariable("employeeId") int employeeId, @ModelAttribute("employee") final Employee employee, BindingResult result, Model model) {
        model.addAttribute("employee", employeeService.findById(employeeId));
        model.addAttribute("mode", "edit");
        return "employee";
    }
}

package com.poc.springboot.service1;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetailsController {
	
	@RequestMapping(value = "/service1", method = RequestMethod.GET)
    public Collection getEmployeeNames() {
        return EmployeeSource.getEmployees();
    }
}
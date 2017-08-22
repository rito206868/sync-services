package com.poc.springboot.employeedetails;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSource {
    private static final Map<String, Employee> EMPLOYEES = new HashMap<>();
    static {
        Employee emp1 = new Employee();
        emp1.setId("01");
        emp1.setName("Joe");
        emp1.setAge(32);
        
        Employee emp2 = new Employee();
        emp2.setId("02");
        emp2.setName("Sam");
        emp2.setAge(41);
        
        
        
               
        EMPLOYEES.put(emp1.getId(), emp1);
        EMPLOYEES.put(emp2.getId(), emp2);
       
    }
    
    public static Collection<Employee> getEmployees() {
        return EMPLOYEES.values();
    }
    
    public static Employee getEmployee(String empId) {
        return EMPLOYEES.get(empId);
    }
}

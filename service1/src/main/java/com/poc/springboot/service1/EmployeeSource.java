package com.poc.springboot.service1;

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
        
               
        EMPLOYEES.put(emp1.getId(), emp1);
       
        
    }
    
    public static Collection<Employee> getEmployees() {
        return EMPLOYEES.values();
    }
    
    public static Employee getEmployee(String empId) {
        return EMPLOYEES.get(empId);
    }
}

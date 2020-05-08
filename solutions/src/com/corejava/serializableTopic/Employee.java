package com.corejava.serializableTopic;

import java.io.Serializable;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class Employee implements Serializable {
    String name;
    Long Employee_id;
    String department;

    public Employee(String name, Long employee_id, String department) {
        this.name = name;
        Employee_id = employee_id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        Employee_id = employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

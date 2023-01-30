package com.Manager.Manager.Services;

import com.Manager.Manager.model.Employee;

import java.util.List;

public interface EmpInterface {

    public List<Employee> getEmpUnderManager(Long ManagerId);
    public List<Employee> getAllEmpList();

}

package com.Manager.Manager.Services;

import com.Manager.Manager.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpImpl implements EmpInterface{


    List<Employee> EmployeeList = List.of(
            new Employee(12L,"Rutuja Saraf",1361L),
            new Employee(13L,"Saloni Singh",4444L),
            new Employee(18L,"Rudresh Saraf",1361L),
            new Employee(14L,"Priyanka patil",4444L),
            new Employee(25L,"Suraj Gupta",1881L)
    );

    @Override
    public List<Employee> getEmpUnderManager(Long ManagerId) {
        return this.EmployeeList.stream().filter(Employee ->Employee.getMangerId()==(ManagerId)).collect(Collectors.toList());
    }

    public List<Employee> getAllEmpList()
    {
        return EmployeeList;
    }



}

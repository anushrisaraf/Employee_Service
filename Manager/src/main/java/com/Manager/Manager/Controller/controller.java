package com.Manager.Manager.Controller;

import com.Manager.Manager.Services.EmpInterface;
import com.Manager.Manager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Emp")
public class controller {

    @Autowired
    private EmpInterface empInterface;

@GetMapping("/Manager/{managerId}")
public List<Employee> getEmpUnderManagerId(@PathVariable("managerId") Long ManagerId)
{
    return empInterface.getEmpUnderManager(ManagerId);
}

    @GetMapping("/AllEmp")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Employee> getEmp() { //todo-done

        return this.empInterface.getAllEmpList();
    }

}

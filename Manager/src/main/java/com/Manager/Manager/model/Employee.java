package com.Manager.Manager.model;

public class Employee {

    private Long EmpId;
    private String EmpName;

    private Long MangerId;

    public Employee(long empId, String empName, Long mangerId) {
        EmpId = empId;
        EmpName = empName;
        MangerId = mangerId;
    }

    public Employee(long l, String prashant_tiwari)
    {

    }

    public long getEmpId() {
        return EmpId;
    }

    public void setEmpId(long empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public long getMangerId() {
        return MangerId;
    }

    public void setMangerId(long mangerId) {
        MangerId = mangerId;
    }
}

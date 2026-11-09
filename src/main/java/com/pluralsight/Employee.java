package com.pluralsight;

public class Employee {
    private static final double OVERTIME_CUTOFF = 40;

    private int employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void punchTimeCard(double startTime, double endTime) {
        this.hoursWorked = Math.max(0, endTime - startTime);
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(OVERTIME_CUTOFF, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - OVERTIME_CUTOFF);
    }
}

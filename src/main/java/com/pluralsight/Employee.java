package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private static final double OVERTIME_CUTOFF = 40;

    private int employeeId;
    private String name;
    private String department;
    private double hoursWorked;
    private double payRate;
    private double punchInTime;

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

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void punchIn(int time) {
        punchInTime = time;
    }

    public void punchIn() {
        punchInTime = currentTimeToDecimal();
    }

    public void punchOut(int time) {
        hoursWorked = time - punchInTime;
    }

    public void punchOut() {
        hoursWorked = currentTimeToDecimal() - punchInTime;
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

    public double currentTimeToDecimal() {
        LocalTime now = LocalTime.now();
        return now.getHour() + (double) now.getMinute() / 60;
    }

}

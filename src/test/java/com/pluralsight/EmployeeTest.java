package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        Employee testEmployee = new Employee(1, "Hage Primus", "Software", 0, 25);
        int expectedHours = 8;

        testEmployee.punchIn(8);
        testEmployee.punchOut(16);

        assertEquals(expectedHours, testEmployee.getHoursWorked());
    }

    @Test
    void punchInDateTime() {
        Employee testEmployee = new Employee(1, "Hage Primus", "Software", 0, 25);
        int expectedHours = 0;

        testEmployee.punchIn();
        testEmployee.punchOut();

        assertEquals(expectedHours, testEmployee.getHoursWorked());
    }
}
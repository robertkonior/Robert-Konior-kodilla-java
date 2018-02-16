package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdaptee = new SalaryAdapter();
        //When
        double totalSalary = salaryAdaptee.TotalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(totalSalary);
        assertEquals(27750,totalSalary,0);
    }
}

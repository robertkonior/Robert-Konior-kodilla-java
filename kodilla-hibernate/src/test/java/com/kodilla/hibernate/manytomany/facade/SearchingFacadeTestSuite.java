package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    SearchingFacade searchingFacade;

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;


    @Test
    public void testFindCompanyByName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company dataMatter = new Company("Data Matter");
        Company dataKingdom = new Company("Data Kingdom");
        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(dataMatter);
        companyDao.save(dataKingdom);

        List<Company> foundCompany = searchingFacade.findCompanyByName("Data");
        //Then
        try {
            Assert.assertEquals(3, foundCompany.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMasters);
            companyDao.delete(dataMatter);
            companyDao.delete(dataKingdom);
        }
    }

    @Test
    public void testFindEmployeeByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieGoth = new Employee("Stephanie", "Goth");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee terranceFixmer = new Employee("Terrance", "Fixmer");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieGoth);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(terranceFixmer);

        List<Employee> foundEmployee = searchingFacade.findEmployeeByName("th");
        //Then
        try {
            Assert.assertEquals(2, foundEmployee.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieGoth);
            employeeDao.delete(lindaKovalsky);
            employeeDao.delete(terranceFixmer);
        }


    }

}
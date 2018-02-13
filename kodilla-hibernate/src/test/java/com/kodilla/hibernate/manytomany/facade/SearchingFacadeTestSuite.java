package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

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
    public void testFindCompanyByName(){
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company dataMatter = new Company("Data Matter");
        Company dataKingdom = new Company("Data Kingdom");
        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(dataMatter);
        companyDao.save(dataKingdom);

        List<Company> foundCompany = searchingFacade.findCompanyByName("Data");
        //Then
        Assert.assertEquals(3,foundCompany.size());


    }

}
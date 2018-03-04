package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
                try {
                companyDao.delete(softwareMachineId);
                companyDao.delete(dataMaestersId);
                companyDao.delete(greyMatterId);
            } catch (Exception e) {
            }
        }
    @Test
    public void testNamedQueries() {
        //Given
        Employee regularMVP = new Employee("Charles", "Barkley");
        Employee finalMVP = new Employee("Michael", "Jordan");

        Company west = new Company("Phoenix Suns");
        Company east = new Company("Chicago Bulls");

        west.getEmployees().add(regularMVP);
        east.getEmployees().add(finalMVP);

        regularMVP.getCompanies().add(west);
        finalMVP.getCompanies().add(east);

        companyDao.save(west);
        int westId = west.getId();
        companyDao.save(east);
        int eastId = east.getId();

        //When
        List<Employee> retrieveEmployee = employeeDao.retrieveEmployeeByLastname("Jordan");
        List<Company> retrieveCompany = companyDao.retrieveCompanyThatStartsWith("Chi");

        //Then
        Assert.assertNotEquals(0, retrieveEmployee.size());
        Assert.assertNotEquals(0, retrieveCompany.size());

        //Cleanup
        try {
            companyDao.delete(eastId);
            companyDao.delete(westId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package com.cucumber.Cucumber.steps;

import com.cucumber.Cucumber.config.ApplicationConfig;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;
import org.assertj.core.api.SoftAssertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@CucumberContextConfiguration
@ContextConfiguration(classes = ApplicationConfig.class)
public class CucumberSteps {

    @Autowired
    List<String>  employees;

    @Autowired
    private SoftAssertions softAssertions;

    @Given("{string} is hired")
    public void addEmployee(String name) {
        employees.add(name);
        System.out.println(name + " joined");
    }

    @Then("Company has n+{int} employees")
    public void companySizeValidation(Integer size) {
        softAssertions.assertThat(employees.size()).isEqualTo(size);
        System.out.println(employees.size());
    }

    @After
    public void testAll(){
        softAssertions.assertAll();
    }

}

package com.cucumber.Cucumber.config;

import org.assertj.core.api.SoftAssertions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Bean
    List<String> employees() {
        return new ArrayList<>();
    }

    @Bean
    SoftAssertions softAssertions(){
        return new SoftAssertions();
    }

}

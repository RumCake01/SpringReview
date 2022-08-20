package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigApp{

    @Bean // -> ready classes
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor("test12");

    }
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

}
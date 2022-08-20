package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigApp{

//    PartTimeMentor partTimeMentor(){
//        return new PartTimeMentor();
//
//    }
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

}
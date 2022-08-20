package com.cydeo.bean_annotation;

import org.springframework.stereotype.Component;


public class PartTimeMentor {

    public  void createAccount(){
        System.out.println("Part Time Mentor is created");
    }

     static String a = "Apple";

    public PartTimeMentor(String a) {
        this.a = a;
    }
}

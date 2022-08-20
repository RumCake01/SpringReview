package com.cydeo.bean_annotation;

import org.springframework.stereotype.Component;

@Component
public class FullTimeMentor {
    public static void main(String[] args) {


    }


    public void createPrtTimeMentor () {
        PartTimeMentor partTimeMentor = new PartTimeMentor("Test");
        System.out.println(partTimeMentor.a);
    }

    public void createAccount () {
        System.out.println("Full Time Mentor is created");
    }
}


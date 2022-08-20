package com.cydeo.multiple_beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppleApp {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(FruitConfig.class);
        Fruit fr = container.getBean("bean1", Fruit.class);
        Fruit fr2 = container.getBean("bean2", Fruit.class);
        System.out.println(fr.getType());
        System.out.println(fr2.getType());




    }




    }
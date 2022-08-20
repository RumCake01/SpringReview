package com.cydeo.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApp{
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigBooks.class);

        FirstBook fb = container.getBean(FirstBook.class);
        System.out.println(fb.cost1());

        SecondBook sb = container.getBean(SecondBook.class);
        System.out.println(sb.cost2());


    }
}
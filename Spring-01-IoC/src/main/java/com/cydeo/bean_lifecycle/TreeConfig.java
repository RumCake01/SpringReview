package com.cydeo.bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class TreeConfig {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(TreeConfig.class);

          Tree tr1 = container.getBean(Tree.class);
//        Tree tr2 = container.getBean(Tree.class);
//        System.out.println(tr1.equals(tr2));



    }

}

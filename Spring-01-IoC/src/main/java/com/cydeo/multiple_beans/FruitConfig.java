package com.cydeo.multiple_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class FruitConfig {


    @Bean(name="bean1")
    //@Primary
    Fruit fruit1 () {
        Fruit f1 = new Fruit();
        f1.setType("fiji");
        return f1;
    }


    @Bean(name="bean2")
    Fruit fruit2 () {
        Fruit f1 = new Fruit();
        f1.setType("empire");
        return f1;
    }



}

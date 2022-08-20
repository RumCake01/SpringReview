package com.cydeo.bean_lifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // will allow to create a new bean
@Lazy // whn this one used then Spring dont create beans by default

public class Tree {

    public Tree() {
        System.out.println("test");
    }


    public void growTrees(String type){
        System.out.println(type);

    }
}

package com.cydeo.dependency_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("class")
public class ClassNote implements AdditionalNote{

    @Override
    public int additionalCost() {
        return 50;
    }
}

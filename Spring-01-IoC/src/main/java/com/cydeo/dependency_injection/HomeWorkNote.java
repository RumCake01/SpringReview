package com.cydeo.dependency_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("home")
public class HomeWorkNote implements AdditionalNote{


    @Override
    public int additionalCost() {
        return 500;
    }
}

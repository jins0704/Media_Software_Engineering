package com.lab5.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanD {

    @Autowired
    private BeanC bC;

    public void printD(){
        System.out.println("BeanD");
        bC.printC();
    }
}

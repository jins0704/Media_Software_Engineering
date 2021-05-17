package com.lab5.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC {

    @Autowired
    private BeanE bE;

    public void printC(){
        System.out.println("BeanC");
        bE.printE();
    }
}

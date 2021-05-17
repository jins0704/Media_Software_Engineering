package com.lab5.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    @Autowired
    private BeanB bB;

    @Autowired
    private BeanE bE;

    public void printA(){
        System.out.println("BeanA");
        bB.printB();
        bE.printE();
    }
}

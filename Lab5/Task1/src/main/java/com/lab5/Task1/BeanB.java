package com.lab5.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    @Autowired
    private BeanD bD;

    public void printB(){
        System.out.println("BeanB");
        bD.printD();
    }
}

package com.lab5.Task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Task1Application.class, args);

		System.out.println("BeanA's method");
		BeanA beanA = context.getBean(BeanA.class);
		beanA.printA();

		System.out.println("\nBeanB's method");
		BeanB beanB = context.getBean(BeanB.class);
		beanB.printB();

		System.out.println("\nBeanC's method");
		BeanC beanC = context.getBean(BeanC.class);
		beanC.printC();

		System.out.println("\nBeanD's method");
		BeanD beanD = context.getBean(BeanD.class);
		beanD.printD();

		System.out.println("\nBeanE's method");
		BeanE beanE = context.getBean(BeanE.class);
		beanE.printE();

		context.close();

	}

}

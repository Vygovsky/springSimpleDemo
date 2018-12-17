package com.ua.page_aop_aspectes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("p_aop_aspectes.xml");
        SomeService someService= (SomeService) context.getBean("someService");
        someService.getDouble();
        someService.getInt();
        someService.getDeliver(1);
    }

}

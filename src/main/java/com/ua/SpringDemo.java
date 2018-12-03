package com.ua;

import com.ua.entity.RobotT1000New;
import com.ua.entity.RobotT1000Old;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RobotT1000Old robotT1000Old = (RobotT1000Old) context.getBean("robotT1000Old");
        robotT1000Old.action();
        System.out.println("-------------------------------------//-----------------");

        ApplicationContext contextBase = new ClassPathXmlApplicationContext("contextBase.xml");
        RobotT1000New robotT1000New = (RobotT1000New) contextBase.getBean("robotT1000base");
        robotT1000New.action();
    }
}

package com.ua;

import com.ua.entity.RobotT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RobotT1000 robotT1000 = (RobotT1000) context.getBean("robotT1000");
        robotT1000.dance();
    }
}

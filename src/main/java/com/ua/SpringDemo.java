package com.ua;

import com.ua.entity.RobotT1000Conveyor;
import com.ua.entity.RobotT1000New;
import com.ua.entity.RobotT1000Old;

import com.ua.entity.t1000Pool.T1000MapPool;
import com.ua.entity.t1000Pool.T1000Pool;
import com.ua.interface_.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RobotT1000Old robotT1000Old = (RobotT1000Old) context.getBean("robotT1000Old");
        robotT1000Old.action();*/
        System.out.println("-------------------------------------//-----------------");

      /*  ApplicationContext contextBase = new ClassPathXmlApplicationContext("contextBase.xml");
        RobotT1000New robotT1000New = (RobotT1000New) contextBase.getBean("robotT1000New");
        robotT1000New.action();*/

   /*     ClassPathXmlApplicationContext contextConveyor =
                new ClassPathXmlApplicationContext("converyorT1000.xml");
        RobotT1000Conveyor t1000Conveyor = (RobotT1000Conveyor) contextConveyor.getBean("t1000Conveyor");

        Robot terminator1 = t1000Conveyor.createRobotConveyor();
        Robot terminator2 = t1000Conveyor.createRobotConveyor();
        Robot terminator3 = t1000Conveyor.createRobotConveyor();
        System.out.println("terminator1 : " + terminator1);
        System.out.println("terminator2 : " + terminator2);
        System.out.println("terminator3 : " + terminator3);
*/
/*
        System.out.println("-------------------------------------//-----------------");

        ApplicationContext context2 = new ClassPathXmlApplicationContext("converyorT1000.xml");
        T1000Pool t1000Pool = (T1000Pool) context2.getBean("t1000pool");
        t1000Pool.action();
*/

        System.out.println("-------------------------------------//-----------------");

        ApplicationContext context3 = new ClassPathXmlApplicationContext("converyorT1000.xml");
        T1000MapPool t1000PoolMap2 = (T1000MapPool) context3.getBean("t1000MapRobot");
        t1000PoolMap2.action();
    }
}

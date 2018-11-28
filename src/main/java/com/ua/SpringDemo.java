package com.ua;

import com.ua.entity.RobotT1000;
import com.ua.impl_Sony.HeadSony;
import com.ua.impl_Toshiba.HandToshiba;
import com.ua.impl_Toshiba.LegToshiba;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RobotT1000 robotT1000 = (RobotT1000) context.getBean("robotT1000");
        robotT1000.dance();

       /* HeadSony headSony = new HeadSony();
        HandToshiba handToshiba = new HandToshiba();
        LegToshiba legToshiba = new LegToshiba();

        Robot robot = new Robot(headSony, handToshiba, legToshiba);
        robot.action();*/
    }


}

package com.ua.entity.t1000Pool;

import com.ua.interface_.Robot;
import com.ua.interface_.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotCollection;


    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

   /* @Override*/
    public Collection<Robot> getRobotPool() {
        return robotCollection;
    }

    public void action() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }

    @Override
    public  Map<String, Robot> getRobotMapPool() {
        return null;
    }
}

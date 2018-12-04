package com.ua.entity.t1000Pool;

import com.ua.interface_.Robot;
import com.ua.interface_.RobotPool;

import java.util.Map;

public class T1000MapPool implements RobotPool {
    private Map<String, Robot> robotMap;

    public T1000MapPool(Map<String, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Map<String, Robot> getRobotMapPool() {
        return robotMap;
    }

    public void action() {
        for (Map.Entry<String, Robot> iterat : robotMap.entrySet()) {
            System.out.println(iterat.getKey());
            iterat.getValue().action();
        }
    }
}

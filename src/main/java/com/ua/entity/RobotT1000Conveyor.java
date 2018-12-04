package com.ua.entity;

import com.ua.interface_.Robot;
import com.ua.interface_.RobotConveyor;

public abstract class RobotT1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobotConveyor();
}

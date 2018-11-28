package com.ua.entity;

import com.ua.interface_.Hand;
import com.ua.interface_.Head;
import com.ua.interface_.Leg;
import com.ua.interface_.Robot;

public class RobotT1000 implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public RobotT1000() {
    }

    public RobotT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.think();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing!)))");
    }
}

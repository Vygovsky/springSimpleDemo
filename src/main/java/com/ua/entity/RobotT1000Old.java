package com.ua.entity;

import com.ua.interface_.Hand;
import com.ua.interface_.Head;
import com.ua.interface_.Leg;
import com.ua.interface_.Robot;

public class RobotT1000Old implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    private String color;
    private int age;
    private boolean soundEnable;

    public RobotT1000Old() {
    }

    public RobotT1000Old(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public RobotT1000Old(Head head, Hand hand, Leg leg, String color, int age, boolean soundEnable) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.age = age;
        this.soundEnable = soundEnable;
    }

    public RobotT1000Old(String color, int age, boolean soundEnable) {
        this.color = color;
        this.age = age;
        this.soundEnable = soundEnable;
    }

    @Override
    public void action() {
        head.think();
        hand.catchSomething();
        leg.go();
        System.out.println("Color : " + color);
        System.out.println("Age : " + age);
        System.out.println("Sound : " + soundEnable);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing!)))");
    }
}

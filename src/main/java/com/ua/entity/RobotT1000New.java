package com.ua.entity;

import com.ua.interface_.Hand;
import com.ua.interface_.Head;
import com.ua.interface_.Leg;

public class RobotT1000New extends BaseModel {

    private String color;
    private int age;
    private boolean soundEnable;

    public RobotT1000New() {
    }

    public RobotT1000New(Head baseHead, Hand baseHand, Leg baseLeg) {
        super(baseHead, baseHand, baseLeg);
    }

    public RobotT1000New(String color, int age, boolean soundEnable) {
        this.color = color;
        this.age = age;
        this.soundEnable = soundEnable;
    }

    public RobotT1000New(Head baseHead, Hand baseHand, Leg baseLeg, String color, int age, boolean soundEnable) {
        super(baseHead, baseHand, baseLeg);
        this.color = color;
        this.age = age;
        this.soundEnable = soundEnable;
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
    public void action() {
        getBaseHead().think();
        getBaseHand().catchSomething();
        getBaseLeg().go();
        System.out.println("Color : " + color);
        System.out.println("Age : " + age);
        System.out.println("Sound : " + soundEnable);
    }

    @Override
    public void dance() {
        System.out.println("T1000 dancing!)))");

    }
}

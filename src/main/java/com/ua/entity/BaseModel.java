package com.ua.entity;

import com.ua.interface_.Hand;
import com.ua.interface_.Head;
import com.ua.interface_.Leg;
import com.ua.interface_.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseModel implements Robot {

    @Autowired
    private Head baseHead;
    @Autowired
    private Hand baseHand;
    @Autowired
    private Leg baseLeg;

    public BaseModel() {
        System.out.println(this + " - T500 constructor");
    }

  /*  public BaseModel(Head baseHead, Hand baseHand, Leg baseLeg) {
        this.baseHead = baseHead;
        this.baseHand = baseHand;
        this.baseLeg = baseLeg;
    }*/

    public Head getBaseHead() {
        return baseHead;
    }

    public void setBaseHead(Head baseHead) {
        this.baseHead = baseHead;
    }

    public Hand getBaseHand() {
        return baseHand;
    }

    public void setBaseHand(Hand baseHand) {
        this.baseHand = baseHand;
    }

    public Leg getBaseLeg() {
        return baseLeg;
    }

    public void setBaseLeg(Leg baseLeg) {
        this.baseLeg = baseLeg;
    }


}

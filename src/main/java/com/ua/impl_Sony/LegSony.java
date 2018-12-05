package com.ua.impl_Sony;

import com.ua.interface_.Leg;
import org.springframework.stereotype.Component;

@Component
public class LegSony implements Leg {
    public void go() {
        System.out.println("Go from LegSony");
    }
}

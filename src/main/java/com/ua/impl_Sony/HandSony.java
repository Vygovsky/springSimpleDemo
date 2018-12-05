package com.ua.impl_Sony;

import com.ua.interface_.Hand;
import org.springframework.stereotype.Component;

@Component
public class HandSony implements Hand {
    public void catchSomething() {
        System.out.println("Catched from Sony");

    }
}

package com.ua.impl_Sony;

import com.ua.interface_.Head;
import org.springframework.stereotype.Component;

@Component
public class HeadSony implements Head {

    public void think() {
        System.out.println("Think from Sony");
    }
}

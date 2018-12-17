package com.ua.impl_Sony;

import com.ua.eman.Color;
import com.ua.interface_.Head;
import org.springframework.stereotype.Component;

@Component
public class HeadSony implements Head {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void think() {
        System.out.println("Think from Sony");
    }
}

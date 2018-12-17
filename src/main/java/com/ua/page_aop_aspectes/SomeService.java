package com.ua.page_aop_aspectes;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

    public int getInt() {
        return 5;
    }

    public double getDouble() {
        return 8.8;
    }

    public double getDeliver(int division) {
        if (division == 0) {
            throw new IllegalArgumentException();
        } else {
            return 32 / division;
        }

    }
}

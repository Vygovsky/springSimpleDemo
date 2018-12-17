package com.ua.page_aop_aspectes;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

    public void printValue(Object object) {
        System.out.println(object);
    }

    public void printInit() {
        System.out.println("Init");
    }

    public void printClose() {
        System.out.println("Close");
    }

    public void printException(IllegalArgumentException ex) {
        System.out.println("There has been an exception:" + ex.toString());
    }
}

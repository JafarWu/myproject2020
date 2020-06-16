package com.fju;

public class Car {
    String id;
    long enter;
    long leave;

    public Car(String id) {
        this.id = id;
        enter = System.currentTimeMillis();
    }

}

package com.fju;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int FEE = 30;
    public static void main(String[] args) {
        int func = 0;
        List<Car> cars = new ArrayList();
        while (func !=4) {
            System.out.println("Welcome to Parking lot Management System!");
            System.out.println("1) Car enter");
            System.out.println("2) Car leaving");
            System.out.println("3) Status");
            System.out.println("4) Exit");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            func = Integer.parseInt(s);
            switch (func) {
                case 1:
                    System.out.println("Please enter Car ID.");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added");
                    break;
                case 2:

                case 3:
                    for (Car car : cars) {
                        System.out.println(car.id + "/" + car.enter + "/" + car.leave);
                    }
                    break;
            }
        }
    }
}

package com.company.Objects;

/**
 * Created by dell on 7/5/17.
 */
public class MainClass {

    public static void main(String[] args) {
        CarClass car = new CarClass();
        car.setYear(2018);
        car.setModel("BMW");

        System.out.println("year is "+car.getYear());
        System.out.println("model is "+car.getModel());
    }
}

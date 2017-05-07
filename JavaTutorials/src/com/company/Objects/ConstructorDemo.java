package com.company.Objects;

/**
 * Created by dell on 7/5/17.
 */
public class ConstructorDemo {

    public static void main(String[] args) {
        CarClass c = new CarClass();
        System.out.println(c.getSpeed());
        System.out.println(c.getGear());
        System.out.println("****************************************************************");
        CarClass c1 = new CarClass(2,340);
        System.out.println(c1.getSpeed());
        System.out.println(c1.getGear());
    }
}

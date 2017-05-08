package com.company.overloading;

/***
 *
 */
public class CarOverlaoding2 {

    public static void main(String[] args) {
        increaseSeatHeight(5);
        increaseSeatHeight("7");
    }

    public static void increaseSeatHeight(int seatHeight){
        System.out.println("I accept integer");
    }

    public static void increaseSeatHeight(String seatHeight){
        System.out.println("I accept String ..... ");
    }


}

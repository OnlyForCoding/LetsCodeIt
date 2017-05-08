package com.company.overloading;

/**
 * Created by jitendra on 8/5/17.
 */
public class CarOverloading1 {

    public static void main(String[] args) {
        increaseSeatHeight(3);
        increaseSeatHeight(6,true);
        increaseSeatHeight(7,12);
    }

    public static void increaseSeatHeight(int seatHeight){
        System.out.println("increased seat height by "+seatHeight+" inches");
    }

    public static void increaseSeatHeight(int seatHeight,int seatMove){
        System.out.println("increased seat height by "+seatHeight+" " +
                "inches");
    }

    public static void increaseSeatHeight(int seatHeight,boolean seatMove){
        System.out.println("increased seat height by "+seatHeight+" " +
                "inches and " + " moved by "+seatMove+" inches");
        if (seatMove){
            System.out.println("option saved");
        }
    }

}

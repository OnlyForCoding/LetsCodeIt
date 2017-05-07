package com.company.Objects;

/**
 * Created by dell on 7/5/17.
 */
public class CarClass {
    private int year = 2015;
    private String model;
    private int gear;
    private int speed;

    public CarClass(){
        this(3,345);
        gear = 0;
        speed = 0;
        System.out.println("inside default constructor");
    }

    public CarClass(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
        System.out.println("Inside parameterized constructor");
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getModel(){
        return this.model = model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

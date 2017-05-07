package com.company.oopsconcepts;

/**
 * Created by dell on 7/5/17.
 */
public class Cars {

    int speed;
    protected int pSpeed;

    public Cars(int startSpeed){
        speed = startSpeed;
    }

    public void increaseSpeed(){
        speed++;
        System.out.println("increasing speed");
    }

    public void decreaseSpeed(){
        speed--;
        System.out.println("decreasing speed");
    }
}

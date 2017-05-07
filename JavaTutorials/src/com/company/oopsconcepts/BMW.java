package com.company.oopsconcepts;

/**
 * Created by dell on 7/5/17.
 */
public class BMW extends Cars {

    public BMW(int startSpeed) {
        super(startSpeed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increasing speed of BMW");
    }
}

package com.company.oopsconcepts;

/**
 * Created by dell on 7/5/17.
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        Cars c1 = new Cars(0);
        c1.increaseSpeed();

        BMW b1 = new BMW(34);
        b1.increaseSpeed();

        Cars c2 = new BMW(37);
        c2.increaseSpeed();
    }
}

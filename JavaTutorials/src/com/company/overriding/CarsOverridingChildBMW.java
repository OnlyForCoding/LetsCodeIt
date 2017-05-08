package com.company.overriding;

/**
 * Created by jitendra on 8/5/17.
 */
public class CarsOverridingChildBMW extends CarsOverridingParent{

    public static void main(String[] args) {
        CarsOverridingChildBMW child = new CarsOverridingChildBMW();
        child.engineStart(10);
        CarsOverridingParent parent = new CarsOverridingParent();
        parent.engineStart(20);
        CarsOverridingParent parent1 = new CarsOverridingChildBMW();
        parent1.engineStart(30);
    }

    //@Override
    public void engineStart(int cyl) {
        System.out.println("i am from the child class ...");
    }

    public static void staticMethod(){
        System.out.println("I am static method from child class!!!!");
    }
}

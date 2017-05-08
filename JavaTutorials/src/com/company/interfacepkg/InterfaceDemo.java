package com.company.interfacepkg;

/**
 * Created by jitendra on 8/5/17.
 */
public class InterfaceDemo implements CarInterface,BMWCarsInterface {

    @Override
    public void engineStart(String engineType, boolean isKeyLess) {
        if (isKeyLess){
            System.out.println("starting engine without key of type "+engineType);
        }else
            System.out.println("starting engine with key of type "+engineType);
    }

    @Override
    public void headsUpNavigation() {
        System.out.println("Navigation for BMW cars is super cool");
    }
}

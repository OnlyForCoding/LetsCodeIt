package com.company.interfacepkg;

/**
 * Created by jitendra on 8/5/17.
 */
public class InterfaceRunner {

    public static void main(String[] args) {

        CarInterface ci = new InterfaceDemo();
        ci.engineStart("Diesel",true);
    }
}

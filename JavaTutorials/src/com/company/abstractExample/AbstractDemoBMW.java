package com.company.abstractExample;

/**
 * Created by dell on 7/5/17.
 */
public class AbstractDemoBMW extends AbstractCars{

    public static void main(String[] args) {
        AbstractDemoBMW bmw = new AbstractDemoBMW();
        bmw.engineStart();
    }

    @Override
    public void engineStart() {
        System.out.println("starting BMW Engine");
    }
}

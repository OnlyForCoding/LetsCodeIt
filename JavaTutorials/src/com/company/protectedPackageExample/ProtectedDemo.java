package com.company.protectedPackageExample;

import com.company.oopsconcepts.*;

/**
 * Created by dell on 7/5/17.
 */
public class ProtectedDemo extends Cars{

    public ProtectedDemo(int startSpeed) {
        super(startSpeed);
    }

    public void protectMethod(){
        pSpeed++; // protected variable accessible in another package
        //speed++; // speed is not accessible as it's access modifier is default

    }
}

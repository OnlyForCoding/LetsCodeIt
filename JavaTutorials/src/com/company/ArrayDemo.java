package com.company;

import java.util.Arrays;

/**
 * Created by dell on 7/5/17.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] myArray = {100,10,20,13};

        for (int a:myArray
             ) {
            System.out.println("index :"+a);

        }

        Arrays.sort(myArray);

        for (int a:myArray
                ) {
            System.out.println("index :"+a);

        }

        int[] myCopiedArray = Arrays.copyOf(myArray,10);

        for (int a: myCopiedArray
             ) {
            System.out.println("copied Array " + a);
        }

        String[] myArray1 =  {"hello","hi","bye!!"};

        for (String a:myArray1
                ) {
            System.out.println("index :"+a);

        }

        Arrays.sort(myArray1);

        for (String a:myArray1
                ) {
            System.out.println("index :"+a);

        }
    }
}

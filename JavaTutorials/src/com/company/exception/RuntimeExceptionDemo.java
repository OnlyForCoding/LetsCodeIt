package com.company.exception;

/**
 * Created by dell on 8/5/17.
 */
public class RuntimeExceptionDemo {

    public static void main(String[] args) {

        int a =10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException ar){
            System.out.println("getting arithmatic exception.");
            System.out.println("you can not divide a number by 0");
        }

        int [] arr = {1,2,3};

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("array index out of bound exception is thrown !!!");
        }
    }
}

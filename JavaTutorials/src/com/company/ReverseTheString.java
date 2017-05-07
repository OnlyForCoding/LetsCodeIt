package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dell on 7/5/17.
 */
public class ReverseTheString {

    public static void main(String[] args) {

        String s = " This is the string ";

        System.out.println(ReverseTheString.split(s));
    }

    public static String split(String s) {
        int count = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        String temp = "";
        int k = 0;
        String[] rev = new String[count + 1];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                rev[k++] = temp;
                temp = "";
            } else
                temp = temp+c[i];
        }
        rev[k] = temp;
        String reve = "";
        for (String s1 : rev){
            reve = s1 + " "+reve;
        }
        return reve.trim();
    }

}

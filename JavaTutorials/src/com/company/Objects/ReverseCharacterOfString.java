package com.company.Objects;

import java.util.Scanner;

/**
 * Created by dell on 7/5/17.
 */
public class ReverseCharacterOfString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String reverse = scan.nextLine();
        scan.close();
        System.out.println(ReverseCharacterOfString.reverse(reverse));

    }

    public static String reverse(String originalString){
        String reverse="";
        for (int i = originalString.length()-1 ; i>=0;i--){
            reverse = reverse + originalString.charAt(i);
        }
        return reverse;
    }
}

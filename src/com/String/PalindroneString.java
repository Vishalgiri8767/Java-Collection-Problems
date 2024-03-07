package com.String;

import javax.swing.*;
import java.util.Scanner;

/*
Problem: Check for Palindrome
        Example:
        Input: "racecar"
        Output: Yes (because "racecar" reads the same forward and backward)

        Input: "Hello, World!"
        Output: No (because "Hello, World!" is not a palindrome)
*/
public class PalindroneString {

    public void checkStrPalindrone(String str){

        String reverseStr= "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("original string: "+ str);
        System.out.println("reversed string: "+ reverseStr);

        int count=  str.compareTo(reverseStr);

       if(count==0){
           System.out.println(str+" is palindrone");
        }
        else
           System.out.println(str + " is not palindrone");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String userStr = sc.nextLine();

        PalindroneString p = new PalindroneString();
        p.checkStrPalindrone(userStr);
    }

}

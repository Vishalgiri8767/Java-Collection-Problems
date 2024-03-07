package com.String;

import java.lang.reflect.Array;
import java.util.Scanner;

//Write a Java program that takes a string as input and returns the reverse of that string.
public class ReverseString {
    public String reverseOperation(String message) {

    //    char[] str = message.toCharArray();
        String reversed = "";
        for(int i=message.length()-1; i>=0; i--){
            reversed +=message.charAt(i);
        }
    //    System.out.println(message.compareTo(reversed));
        return reversed;
        /*
        int left=0;
        int right=str.length-1;
        while(left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
        return new String(str);
 */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        ReverseString rs = new ReverseString();
        String reversed = rs.reverseOperation(userInput);
        System.out.println(reversed);
    }
}

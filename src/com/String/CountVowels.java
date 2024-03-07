package com.String;

//Problem: Count Vowels in a String

import java.util.Scanner;

public class CountVowels {
    public int countVowels(String sentence) {

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        CountVowels cv = new CountVowels();
        if (userInput.length() > 0) {
            int count = cv.countVowels(userInput);
            System.out.println("number of vowels " + count);
        }
        else
            System.out.println("plase provide something");
    }
}



package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//method 1.
public class ReverseNum {       //method 1.
    //reverse the arraylist

    ArrayList<Integer> numbers =new ArrayList<Integer>(Arrays.asList(39,29,49,12,24));
    ArrayList<Integer> Reverse = new ArrayList<>();

    int temp;
    public void reverseNum(){                       //method 1.
    for(int i=numbers.size()-1; i>=0; i--) {
        temp = numbers.get(i);
        Reverse.add(temp);
    }
        System.out.println(Reverse);
    }

    public void reverseNum2(){

        Collections.reverse(numbers);
        numbers.forEach(value -> System.out.print(value + " "));
    }
    public static void main(String[] args) {
        ReverseNum rn = new ReverseNum();
        rn.reverseNum();
        rn.reverseNum2();

    }

}

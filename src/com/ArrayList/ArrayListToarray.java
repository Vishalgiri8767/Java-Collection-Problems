package com.ArrayList;

import java.util.ArrayList;

public class ArrayListToarray {

    ArrayList<String> Languages = new ArrayList<>();
    String[] arr = new String[Languages.size()];
    public void arraylistToArray(){

        Languages.add("Java");
        Languages.add("Python");
        Languages.add("C++");

        Languages.toArray(arr);


    }
    public static void main(String[] args) {

        ArrayListToarray a2a = new ArrayListToarray();
        a2a.arraylistToArray();
    }

}

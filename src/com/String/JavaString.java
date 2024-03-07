package com.String;


/*Generally, String is a sequence of characters. But in Java,
 string is an object that represents a sequence of characters.
 The java.lang.String class is used to create a string object.

 There are two ways to create String object:

    1) By string literal
    2) By new keyword

   *** Once String object is created its data or state can't be changed but a new String object is created.***
    -String are immutable in java.
    -


 */

import java.util.Scanner;

public class JavaString {
    public void userStringInput() {

    //operations on String Object.

    Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");    // in case when use give 2 words as input then
    String userInput = sc.next();       // sc.next() will print first word
    String fullName = sc.nextLine();
        System.out.println("you entered "+userInput);  // user give ramesh kumar => print only ramesh
        System.out.println("full name is: "+fullName);
    //for printing whole user input we have to sc.nextLine(); method.

    //    String fullName = sc.nextLine();
    //  System.out.println("enter your full name");
    //  System.out.println("you entered " +fullName);

}

//joing 2 String.
    public void stringConcatenation(){
        String firstName = "Tony";
        String lastName= "Stark";

        String fullName=firstName+" "+lastName;     //used + operator
        System.out.println(fullName);

        //using concatenation method.
        String fullName1 = firstName.concat(lastName);
        System.out.println(fullName1);
    }
    //Access characters of a string
    public void printStringChar(){
        String name= "My name is Tony Stark";
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));     // it include spaces also.
        }
    }
    //check to string are equals or not
    public void equalMethod(){
        String n1 = "Tony";
        String n2 = "Tony";

        if(n1.equals(n2))
            System.out.println("Strings are equal");
        else
            System.out.println("strings are not equal");
    }

    public void compareMethod(){
        String s1 = new String("Suresh");
        String s2 = "suresh";

        /*
        if s1 > s2 => return +ve value
            s1 < s2 => return  -ve value
            s1 == s2 =>  return 0;
         */

        int i = s1.compareTo(s2);
        System.out.println(i);
    }
    //substring.
    public void subString(){
        String sentence = "My name is Lakhan";
        int ind = sentence.indexOf("L");        //indexOf => index of char in string
        System.out.println(ind);
        String subStr = sentence.substring(ind);
        System.out.println(subStr);

        // trim "name" string from sentence;

        String trimmed = sentence.substring(3, 8);
        System.out.println(trimmed);

    }
//ParseInt Method of Integer class
    public void toInt(){
        String str ="123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(((Object) i).getClass());

    }
//ToString Method of String class
    public void toStrring(){
        int num = 123;
        //change type int to String
        String str = Integer.toString(num);
        System.out.println(str);
        String name = ((Object) str).getClass().getName();
        System.out.println(name);
    }
    public static void main(String[] args) {

        JavaString st1 = new JavaString();
        st1.toStrring();

    }

}

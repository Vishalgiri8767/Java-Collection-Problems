package com.String;

import java.util.Scanner;

/*
Input an email from the user. You have to create a username from the email by deleting
the part that comes after ‘@’. Display that username to the user.
        Example :
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/
public class StringProblem2 {

    public String userNameSubString(String email){

        int index = email.indexOf("@");

        String userName= email.substring(0,index);

        return userName;

    }
    public static void main(String[] args) {

        System.out.println("enter your email Id: ");
        Scanner sc = new Scanner(System.in);
        String eMail = sc.next();

        StringProblem2 ob = new StringProblem2();
        String userName = ob.userNameSubString(eMail);
        System.out.println("hiii, "+userName);

    }

}

package com.JavaArray;
import java.util.*;

public class UserDefinedArr {

	public static int size;
	public static void main(String[] args) {

		//write a program by taking values of array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array...");
		size= sc.nextInt();
		
		int marks[] = new int[size];
		
		// Enter elements of the array.
		
		System.out.println("Enter Elements: ");
		
		for(int i=0; i<size; i++) {
			
			int num = sc.nextInt();
			
			marks[i]=num;
			
			
		}
		for(int i: marks) {
			System.out.print(i + " ");
		}
	}

}

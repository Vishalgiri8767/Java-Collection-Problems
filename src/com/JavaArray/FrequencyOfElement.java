package com.JavaArray;
import java.util.*;

public class FrequencyOfElement {

	public static void main(String[] args) {

		
		//Program to find the frequency of each element in the array
		//declare an array.
		
		int num[] = new int[] {12,34,94,34,12,98,48};
		
		//find the frequency of any number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int x = sc.nextInt();
		
		int frn = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i]==x) {
				//frn+=frn;
				System.out.println(findIndex(num, num[i]));
				i++;
			}
		}
		if(frn!=0) {
			System.out.println("item found "+ frn+ " times");
		}
		else {
			System.out.println("sorry couldn't find!!!");
		}
		
		
	}

	private static char[] findIndex(int[] num, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

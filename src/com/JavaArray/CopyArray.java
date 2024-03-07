package com.JavaArray;

public class CopyArray {

	public static void main(String[] args) {

		int marks[] = {3,4,9,8,5};
		
		//copy elements from the marks to newMarks.
		
		//declare newMarks.
		
		int newMarks[] = new int[marks.length]; 
		
		//We have System class which has arraycopy method.
		
		System.arraycopy(marks, 0, newMarks, 0, marks.length);
		
		for(int i: newMarks) {
			System.out.print(i+" ");
		}
		
	}

}

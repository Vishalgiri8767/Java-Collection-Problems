package com.JavaArray;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {3,4,9,93,5,7,0};
		
		//find index of elements.
		
		int num =5;
		int sum= 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println("item found.. at index "+ i);
			}
			else {
				sum+=sum;
			}
		}
		//System.out.println(sum);
		if(sum==0) {
			System.out.println("sorry item not found!!!");
		}
		
		
	}

}

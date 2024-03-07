package com.JavaArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	array a = new array();
	//	a.buildArr1();
		
	//	array.buildArr1();
	//	array.buildArr2();
		
		MultiArr.test1();
	}

}
class array{
	
	public static void buildArr1() {
		
	//creating array. 
	int arr[] = new int[4];
	
	//asssign the values;
	
	arr[0]=3;		//array indexing starts with 0;
	arr[1]=8;
	arr[2]=5;
	//arr[3]=4;
	
	
	//fetch the values.
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	
	
	//fetch all the values usign loop
	
	System.out.println("iteration of array using for loop");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println();
	for(int i: arr) {
		System.out.print(i +" ");
	}
	System.out.println();
	System.out.println();
	}	
	public static void buildArr2() {
		
		int arr2 [] = {34,29,9,14};
		
		for(int i: arr2) {
			System.out.print(i +" ");
		}
		
	}
}
class MultiArr{
	
	static void test1() {
		
		int arr1[]= {3,5,9,4};
		int arr2[]= {5,1,7,3};
		int arr3[]= {2,4,6,0};
		
		//store this array inside a single array.
		
		int multiArr[][]= {arr1, arr2,arr3};
		//System.out.println(multiArr[2][3]);
		
		//iterate multidimenstional array.
		for(int i=0; i<multiArr.length; i++) {
			for(int j=1; j<multiArr.length; j++)
				System.out.print(multiArr[i][j]+" ");
		}
		
	}
	
	
}
package com.JavaArray;
import java.util.*;

public class User2DArr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array...");
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		System.out.println("your array is "+ row+"*"+col);
		System.out.println("enter values of the array.");
		
		// 2D array
		 int arr2D[][] = new int[row][col];
		
		
		//row
		for(int i=0; i<row; i++) {
			//column
			for(int j=0; j<col; j++) {
				int value = sc.nextInt();
				arr2D[i][j]=value;
				
			}
		}
		//output
		System.out.println("your 2D array is: ");
		
		for(int k=0; k<row; k++) {
			for(int l=0; l<col; l++) {
				
				System.out.print(arr2D[k][l]+" ");
				
			}
			System.out.println();
			//System.out.println(arr2D[k]);
		}
		
		int yes = 0;
		int number = sc.nextInt();
		System.out.println("find "+ number+ " from the array");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			
				if(arr2D[i][j]==number) {
					System.out.println(i +" "+j);
					//yes = yes+1;
				}
//				else
//					System.out.println();
//					
//				
//			
//			}
		}
//		if(yes>0) {
//			System.out.println("sorry item not found");
//		}
	}
	}
}



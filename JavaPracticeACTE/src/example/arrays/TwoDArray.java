package example.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//Create a 2D Array
		int[][] arr = new int[5][5];
		
		//manual data feeding
		arr[0][0]=1;
		arr[1][1]=1;
		arr[2][2]=1;
		arr[3][3]=1;
		arr[4][4]=1;
		
		//print using for loop
		for(int i=0;i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		//feed using for loop
		int[][] arr1 = new int[2][2];
		System.out.println("Enter the values for the 2D array");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				int value = sc.nextInt();
				arr1[i][j]=value;
			}
		}
		sc.close();
		
		//print using for loop
		for(int i=0;i<arr1.length;i++) {
			for(int j =0; j<arr1[i].length;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
	}

}

package example.arrays;

import java.util.*;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 10 };

		// .toString method
		System.out.println(Arrays.toString(arr));

		// sorting the array
		Arrays.sort(arr);
		System.out.println("Sorted array=> " + Arrays.toString(arr));

		// Arrays.binarySearch method
		System.out.println("the element is on the index: " + Arrays.binarySearch(arr, 5));

		// Arrays.equals() method
		int[] arr1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 10 };
		Arrays.sort(arr1);
		if (Arrays.equals(arr, arr1)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		// Arrays.copyOf() method
		int[] subArr = Arrays.copyOf(arr1, 5);
		System.out.println("the copied array =>" + Arrays.toString(subArr));

		// Arrays.copyOfRange()
		int[] subArr2 = Arrays.copyOfRange(arr, 5, 10);
		System.out.println("Array within the given range =>" + Arrays.toString(subArr2));

		// Arrays.fill()
		int[] nums = new int[5];
		Arrays.fill(nums, 6);
		System.out.println(Arrays.toString(nums));

		int[][] arr3 = new int[5][5];

		// manual data feeding
		arr3[0][0] = 1;
		arr3[1][1] = 1;
		arr3[2][2] = 1;
		arr3[3][3] = 1;
		arr3[4][4] = 1;
		
		System.out.println(Arrays.deepToString(arr3));
	}

}

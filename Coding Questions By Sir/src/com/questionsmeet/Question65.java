package com.questionsmeet;

/*
 * 65.	If 2nd array is present in 1st array in same order then return
 *  the index of number of 1st array where 2nd array is present
 */
public class Question65 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = { 4,5 };

		int m = arr1.length;

		int n = arr2.length;

		subset_arrays(arr1, arr2, m, n);

	}

	static void subset_arrays(int arr1[], int arr2[], int m, int n) {

		int i = 0;
		int j = 0;
		boolean flag = false;
		int index = 0;
		while (i < m && j < n) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;

				if (j == n) {
					/*System.out.println(i);
					System.out.println(j);*/
					index = i - j;
					flag = true;
					break;
				}
			} else {
				i = i - j + 1;
				j = 0;
			}
		}

		if (flag) {
			System.out.println("Array B is Sub array of Array A which Start from Index " + index);
		} else {
			System.out.println("NOT");
		}
	}

}

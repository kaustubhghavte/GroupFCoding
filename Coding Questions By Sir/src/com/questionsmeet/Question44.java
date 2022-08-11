package com.questionsmeet;

//suppose if A1 array and A2 array check A2 is subarray of A1 or not
public class Question44 {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6 };
					// 0, 1, 2, 3, 4, 5
		int arr2[] = { 2,3,4 };
					// 0,1,2
		boolean res = isSubArray(arr1, arr2, arr1.length, arr2.length);
		System.out.println(res);
	}

	public static boolean isSubArray(int A[], int B[], int n, int m) {
		int i = 0;
		int j = 0;
		
		while(i<n && j<m) {
			if(A[i] == B[j]) {
				i++;
				j++;
				
				if(j==m) {
					return true;
				}
			}else {
				i++;
				j=0;
			}
		}
		return false;
	}
}
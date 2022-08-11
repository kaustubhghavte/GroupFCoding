package com.questionsmeet;
/*
 * Program to return the sum of all the elements from both the diagonals in N×N 
	Matrix.Matrix is a two dimensional array of int type. int[ ][ ] matrix;
 */
public class Question31 {
	
	public static void main(String[] args) {
		int arr[][] = {{1,2},{3,4},{5,6}};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println("Total Sum : " + sum);
		
	}

}

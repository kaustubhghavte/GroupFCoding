package com.questionsmeet;
/*
 * write a program of array that if similar elements should be added and 
 * if all the element are same then output shoud be 0
 */
public class Question53 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,2};
		
		if (areSame(arr) == 0)
            System.out.println("All Elements are Same");
        else
            System.out.println("Not all Elements are Same");
	}
	
	public static int areSame(int arr[])
    {
       int first = arr[0];
       for (int i=1; i<arr.length; i++)
           if (arr[i] != first) {
        	   
        	   return 0;
           }
       return 1;
    }

}

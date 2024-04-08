package Project1;

import java.util.Scanner;

public class aula_22_02_2024 {

	public static double sumArray (double[] a) {
		// Suma
		double total =0.0;
		for (int i=0; i< a.length; i++)
			total += a [i];
		return total;
	}
	public static double averageArray (double[] a) {
		// Média
		double total =0.0;
		for (int i=0; i< a.length; i++)
			total += a [i];
		return (total/a.length);
	}
	public static double[] sortArray (double[] nums) {
		// Sort
		int min;
		double temp;
		for (int i=0; i<nums.length-1; i++) 
		{
			min=i;
			for (int j=i+1; j<nums.length; j++)
				if (nums[i]<nums[min])
					min=j;
			if (min != i)
			{
				temp = nums [i];
				nums[i]= nums[min];
				nums[min] = temp;
			}
		}
		return nums;
	}


	public static void main (String args[])
 	{
	 double nums1[]= {33.1, -15.2, 112.3, 143.4, -14.5};
	 for (int i =0; i < nums1.length; i++)
		 System.out.print(nums1[i]+"|");
	 
	 System.out.println("");
	 System.out.println("Sum of the array = "+ sumArray(nums1));
	 System.out.println("Average of the array = "+ averageArray(nums1));
	 String result1 = String.format("%.2f", averageArray(nums1));
	 System.out.println("Average of the array (fixed decimal places)= "+ result1);
	 
	 double[] result2 = sortArray(nums1);
	 
	 for (int i =0; i < result2.length; i++)
		 System.out.print(result2[i]+"|");
	
 	}
 }
package Essays;

public class Essay1 {
	//Ex2
	public static double sumArray (double[] a) {
		// Suma
		double total =0.0;
		for (int i=0; i< a.length; i++)
			total += a [i];
		return total;
	}
	//Ex3	
	public static double averageArray (double[] a) {
		// Média
		double total =0.0;
		for (int i=0; i< a.length; i++)
			total += a [i];
		return (total/a.length);
	}
	//Ex4	
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
	//Ex5
	public static void matiz2D(int[][] matriz, int dim ) {
		System.out.println();	
		int i,j, k =0;
		
		for (i=0; i<dim; i++)
		{
			for (j=0; j<dim; j++)
			{
				matriz[i][j] = k;
				k++;
			}
		}
		for (i=0; i<dim; i++)
		{
			for (j=0; j<dim; j++)
			{
				System.out.print(matriz[i][j] + "\t");				
			}
			System.out.println();
		}
	}
	//Ex6
	public static void sum1Diogonal(int[][] matriz, int dim ) {
		System.out.println();
		int i,j, sum=0;
		
		for (i=0; i<dim; i++)
		{
			j=i;
			sum += matriz[i][j];
		}
		System.out.println("Soma da 1ª diagonal = " + sum);
	}
	//Ex7
	public static void sum2Diogonal(int[][] matriz, int dim ) {
		System.out.println();
		int i,j=0, sum=0;
		
		for (i=dim-1; i>=0; i--)
		{
			{
				
				sum += matriz[i][j];
				j++;
			}
			
		}
		System.out.println("Soma da 2ª diagonal = " + sum);
	}


	public static void main (String args[])
 	{
		//Ex1
	 double nums1[]= {33.1, -15.2, 112.3, 143.4, -14.5};
	 for (int i =0; i < nums1.length; i++)
		 System.out.print(nums1[i]+"|");
	 
	 System.out.println("");
	 System.out.println("Sum of the array = "+ sumArray(nums1));
	 System.out.println("Average of the array = "+ averageArray(nums1));
	 String result1 = String.format("%.2f", averageArray(nums1));
	 System.out.println("Average of the array (fixed decimal places)= "+ result1);
	 
	 double[] result2 = sortArray(nums1);
	 System.out.print("Array sorted = ");
	 for (int i =0; i < result2.length; i++)
		 System.out.print(result2[i]+"|");
	
	 int matriz [][];
	 int dim = 5;
	 matriz = new int [dim][dim];
	 matiz2D(matriz, dim);
	 sum1Diogonal(matriz,dim);
	 sum2Diogonal(matriz,dim);
 	}
}

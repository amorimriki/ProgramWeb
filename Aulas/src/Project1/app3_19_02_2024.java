package Project1;

public class app3_19_02_2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][];
		matriz = new int [10][11];
		int i,j, k =0;
		
		for (i=0; i<10; i++)
		{
			for (j=0; j<11; j++)
			{
				matriz[i][j] = k;
				k++;
			}
		}
		for (i=0; i<10; i++)
		{
			for (j=0; j<11; j++)
			{
				System.out.print(matriz[i][j] + "\t");				
			}
			System.out.println();
		}
	
	}

}

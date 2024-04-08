package Project1;

import java.util.Random;
import java.util.Scanner;

public class aula_29_02_2024 {
	public static void matriz2DrandomInt() {
		Random rdm = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Número de linhas /colunas: ");
		int l = in.nextInt();
		int i,j;
		char [][] matriz2 = new char [l][l];
		int [][] matriz3 = new int [l][l];
		
		// gerador de matiz com inteiros random
		for (i=0; i<l; i++) {
			for (j=0; j<l; j++) 
				matriz3[i][j]=rdm.nextInt(100);
		}
		// imprimir
		for (i=0; i<l; i++) {
			for (j=0; j<l; j++) 
				System.out.print(matriz3[i][j] + "\t");
			System.out.println();
		}
	}
	public static void matriz2DrandomChar() {
		Random rdm = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Número de linhas /colunas: ");
		int l = in.nextInt();
		int i,j;
		char [][] matriz2 = new char [l][l];
		
		
		// gerador de matiz com caracteres random
				for (i=0; i<l; i++) {
					for (j=0; j<l; j++) 
						matriz2[i][j]= (char)(rdm.nextInt(26)+ 'a');
				}
				// imprimir
				for (i=0; i<l; i++) {
					for (j=0; j<l; j++) 
						System.out.print(matriz2[i][j] + "\t");
					System.out.println();
				}
	}
	
	public static void main(String[] args) {
		//EX1
		matriz2DrandomInt();
		matriz2DrandomChar();

	}
}

package Essays;

import java.util.Random;
import java.util.Scanner;

public class Essay2 {
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
	public static int iteraFatorial(int n) {
		int i, total=1;
		for (i=1 ; i<n ; i++) 
			total += total * i;
		return total;
	}
	
	public static long recuFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else 
            return n * recuFatorial(n - 1);
        
	}
	
    public static void numPrimo(int n) {
        int flag =1;
    	if (n <= 1) {
            	System.out.println (n+" não é primo");
            	flag = 0;
            	// return false; // 0 e 1 não são primos
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                	System.out.println (n+" não é primo");
                	flag = 0;
                	break;
                	//   return false; // Se n é divisível por algum número entre 2 e sqrt(n), não é primo
                }
            }
            
            //return true; // Se não foi divisível por nenhum número, é primo
            if (flag == 1)
            	System.out.println (n+" é primo");    
    }
    public static int iteraFibonacci(int n) {
    	if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

   
    public static int recuFibonacci(int n) {
     	if (n <= 1) {
            return n;
        } else {
            return recuFibonacci(n - 1) + recuFibonacci(n - 2);
        }
    }
    
	
	
	public static void main(String[] args) {
		//EX1
		matriz2DrandomInt();
		//EX2
		matriz2DrandomChar();
		//EX3
		Scanner in = new Scanner(System.in);
		System.out.println("Número: ");
		int n = in.nextInt();
		System.out.println("Fatorial de "+n+" é "+iteraFatorial(n));
		System.out.println("Fatorial de "+n+" é "+recuFatorial(n));
		//EX4
		numPrimo(n);
		//EX5
		//a)
		System.out.println("\n iteraFibonacci ");
		System.out.println("F"+n+"="+iteraFibonacci(n));
		for (int i=0; i<n; i++)
			System.out.print(iteraFibonacci(i)+"|");
		//b)
		System.out.println("\n recuFibonacci ");
		System.out.println("F"+n+"="+recuFibonacci(n));
		for (int i=0; i<n; i++)
			System.out.print(recuFibonacci(i)+"|");
	}

}

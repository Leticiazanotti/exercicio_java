package Teste_;

import java.util.Scanner;

public class exercicio3_arrays {

	public static void main(String[] args) {
		//  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		int[][]num = new int[3][3];
		int linha,coluna,contVal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nDigite um numero: ");
				num[linha][coluna] = leia.nextInt();
				
				if(num[linha][coluna]>10) {
					contVal++;
					
				}
				
				
			}
		}
			System.out.println("\nOs valores são: "+contVal);

				
	}

}

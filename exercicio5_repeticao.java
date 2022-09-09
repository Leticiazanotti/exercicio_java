package Teste_;

import java.util.Scanner;

public class exercicio5_repeticao {

	public static void main(String[] args) {

		int num, somaNum = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um numero");
			num = leia.nextInt();
			somaNum = num + somaNum;

		} while (num != 0);
		System.out.println("\nA soma dos numeros é :" + somaNum);

	}

}

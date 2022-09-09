package Teste_;

import java.util.Scanner;

public class exercicio2_repeticao {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		int x, contImpar = 0, contPar = 0, num;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;

			}

		}
		System.out.println("\nQuantidade de números pares:" + contPar);
		System.out.println("\nQuantidade de números impares: " + contImpar);

	}

}

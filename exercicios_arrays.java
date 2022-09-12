package Teste_;

import java.util.Scanner;

public class exercicios_arrays {

	public static void main(String[] args) {

		float[] numero = new float[6];
		float somaPar = 0, quantImpar = 0;
		int x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++) {
			System.out.println("\nDigite um numero: ");
			numero[x] = leia.nextInt();

			if (numero[x] % 2 == 0) {
				somaPar += numero[x];
			}

		}
		for (x = 0; x < 6; x++) {
			if (numero[x] % 2 != 0)
				quantImpar++;

		}
		for (x = 0; x < 6; x++) {
			if (numero[x] % 2 == 0) {
				System.out.println("\nNumeros pares: " + numero[x]);
			}
		}
		for (x = 0; x < 6; x++) {
			if (numero[x] % 2 != 0) {
				System.out.println("\nNumeros impares: " + numero[x]);
			}
		}

		System.out.println("\nSoma dos numeros pares: " + somaPar);
		System.out.println("\nQuantidade de numeros impares: " + quantImpar);

	}

}

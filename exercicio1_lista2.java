package Teste_;

import java.util.Scanner;

public class exercicio1_lista2 {

	public static void main(String[] args) {

		int x;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite sua idade: ");
		x = leia.nextInt();
		// 10-14 infantil

		if (x >= 10 && x <= 14) {
			System.out.println("\nCategoria Infantil");
			// 15-17 juvenil

		} else if (x >= 15 && x <= 17) {
			System.out.println("\nCategoria juvenil");
			// 18-25 adulto

		} else if (x >= 18 && x <= 25) {
			System.out.println("\nCategoria adulto");

		} else {
			System.out.println("\nOpção inválida");
		}

	}

}

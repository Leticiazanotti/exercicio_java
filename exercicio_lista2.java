package Teste_;

import java.util.Scanner;

public class exercicio_lista2 {

	public static void main(String[] args) {
		//  Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num1,num2,num3;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um numero: ");
		num1 = leia.nextInt();
		System.out.println("\nEscreva um numero: ");
		num2 = leia.nextInt();
		System.out.println("\nEscreva um numero: ");
		num3 = leia.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("\nO maior numero é:"+num1);
			
		}
		else if (num2>=num1 && num2>=num3) {
			System.out.println("\nO maior numero é: "+num2);
			
		}
		else {
			System.out.println("\nO maior numero é: "+num3);
		}
			
	}

}

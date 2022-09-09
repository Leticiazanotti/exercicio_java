package Teste_;

import java.util.Scanner;

public class exericio3_repeticao {

	public static void main(String[] args) {
		//while
		//Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos
		
		int idade21 = 0,idade50 = 0,num=0,idade=0;
		
		Scanner leia = new Scanner(System.in);
				
				System.out.println("\nDigite sua idade:");
				idade = leia.nextInt();
				 
					while(idade!= -99){
						if(idade < 21) {
							idade21++;
						}
						if(idade > 50) {
						  idade50++;	
						}
						 
				
				
					System.out.println("\nDigite sua idade:");
					idade = leia.nextInt();
				
				
					
				}
				 System.out.println("\nTotal de pessoas com menos de 21 anos: "+idade21);
				 System.out.println("\nTotal de pessoas com mais de 50 anos: "+idade50);
				 
				 
		
		
		
	}

}

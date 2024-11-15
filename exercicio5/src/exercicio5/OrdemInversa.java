package exercicio5;

import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criando armazenamento de numeros
		
	
		int[] analiseInvertida = new int[5];
		Scanner leitor = new Scanner (System.in);
	
		// lendo os numeros
		
		for (int i = 0; i < analiseInvertida.length; i++) {
			System.out.println("Digite o" +(i + 1) + "número inteiro:");
			analiseInvertida[i] = leitor.nextInt();
			
	
		}
		
		// lendo os numeros em ordem inversa
		System.out.println("Números em ordem inversa:");
		for (int i = 4; i >= 0; i--) {
			System.out.println(analiseInvertida[i]);
		}
		
		
	}

}

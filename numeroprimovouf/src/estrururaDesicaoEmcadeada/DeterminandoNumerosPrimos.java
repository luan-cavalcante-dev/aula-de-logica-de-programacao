package estrururaDesicaoEmcadeada;

import java.util.Scanner;

public class DeterminandoNumerosPrimos {
 
	public static void main(String[] args) {
		int numero;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o numero");
		numero = leitor.nextInt();
		
		if(numero % 2 == 0 && numero != 2) {
			printNaoEhPrimo();
		}else if(numero % 3 == 0 && numero != 3) {
			printNaoEhPrimo();
		}else if(numero % 5 == 0 && numero != 5) {
			printNaoEhPrimo();
		}else if(numero % 7 == 0 && numero != 7) {
			printNaoEhPrimo();
		}else if(numero % 11 == 0 && numero != 11) {
			printNaoEhPrimo();
		}else if(numero % 13 == 0 && numero != 13) {
			printNaoEhPrimo();
		}else {
			System.out.println("É primo !!");
		}
	}
	
	private static void printNaoEhPrimo () {
		System.out.println("Não é primo");
	}
	
}

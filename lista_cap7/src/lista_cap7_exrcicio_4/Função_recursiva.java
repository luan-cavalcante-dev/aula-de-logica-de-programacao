package lista_cap7_exrcicio_4;

import java.util.Scanner;

public class Função_recursiva {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner (System.in)) {
			int numero = leitor.nextInt();
			
			if(primo(numero)) {
				System.out.println("O numero é primo");
			}else {
				System.out.println("O numero não é primo");
			}
		}
		
		System.out.println();
		

	}
	public static boolean primo(int numero) {
		if(numero<2) {
			return false;
		}
		return primo(numero, 2);
	}
	
	public static boolean primo(int numero, int divisor) {
		if (divisor >= numero) {
			return true;
		}
		
		if( numero % divisor == 0 && divisor != 1 && divisor != numero) {
			return false;
		}
		return primo(numero, divisor +1);
	}
}

package calculadora;

import java.util.Scanner;

public class calculadoraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variavel para a executar

		double numero1;
		double numero2;
		String operacao;
		Double resultado = null;

		// leitura teclado
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		 numero1 = scan.nextDouble();
		 System.out.println("Digite Sinal");
		 operacao = scan.next();
		 System.out.println("Digete o segndo valor");
		 numero2 = scan.nextDouble();
		// fazendo o caulo
		switch (operacao) {
			case "+":
				resultado = numero1 + numero2;  
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "/":
				resultado = numero1 / numero2;
				break;
			case "*":
				resultado = numero1 *  numero2;
				break;
			
				
				
			default:
				System.out.println("Operação Invalida");
				
				
		}
		
		if(resultado != null) {
			System.out.println(resultado);			
		}
	}

}

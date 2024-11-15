package biblioteca;

import java.util.Arrays;
import java.util.Iterator;

public class BibMat {

	public static int soma(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public static int subtracao(int valor1, int valor2) {
		return valor1 - valor2;
	}

	public static int multiplicacao(int valor1, int valor2) {
		return valor1 * valor2;
	}

	public static int divisao(int valor1, int valor2) {
		if (valor2 == 0) {
			throw new ArithmeticException("Divisão por zero");
		}
		return valor1 / valor2;
	}

	public static int exponenciacao(int base, int expoente) {
		if (expoente < 0) {
			throw new ArithmeticException("Esperado números positivos");
		}
		return (int) Math.pow(base, expoente);
	}

	public static double media(int[] numeros) {
		int total = 0;
		int comprimento = numeros.length;

		if (comprimento == 0) {
			throw new ArithmeticException("Conjunto vazio");
		}

		for (int num : numeros) {
			total += num;
		}
		return total / comprimento;
	}

	public double mediana(int[] numeros) {
		int comprimento = numeros.length;

		if (comprimento == 0) {
			throw new ArithmeticException("Conjunto vazio");
		}
		double resultado;
		Arrays.sort(numeros);
		if (comprimento % 2 == 0) {
			resultado = (numeros[comprimento / 2 - 1] + numeros[comprimento / 2 + 1])/2;
		} else {
			resultado = numeros[comprimento / 2 ] ;
		}
		return resultado;
	}
	
	public double variancia(int[] numeros) {
		double media = media(numeros);
		double somaDiferencaQuadrados = 0;
		
		for (int numero : numeros) {
			somaDiferencaQuadrados += Math.pow(numero - media, 2);
		}
		
		return somaDiferencaQuadrados / numeros.length;
	}
	
	public static double desvped(int[] numeros) {
		double variancia = varian
		
		return 0;
	}

}

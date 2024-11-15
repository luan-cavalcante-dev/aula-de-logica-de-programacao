package exerciciocap6;

import java.util.Iterator;
import java.util.Scanner;

public class imprimindoNumeros {

	public static void main(String[] args) {

		// exebir um numero na tela
		// criando variaveis

		int valorMaximo = 50;
		int valorStop = 13;

		for (int contador = 1; contador <= valorMaximo; contador++) {
			if (contador % valorStop == 0) {
				break;
			}
			System.out.println(contador);
		}
		

	}

}

package cap6matrizes3x3;

import java.util.Arrays;
import java.util.Scanner;

public class SomaMatrizes {
	
	public static void main(String[] args) {
		
	// informando matriz
		
		int[][] matriz1 = new int [3][3];
		int[][] matriz2 = new int [3][3];
		
		// informação do usuario
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Digite os numeros que deseja na matrix");
				matriz1[i][j]=leitor.nextInt();
				System.out.println("Digite os numeros que deseja na matrix");
				matriz2[i][j]=leitor.nextInt();
			}
		}
		
		
	// somando as matriz
		
		int[][] matrizSoma = new int [3][3];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				
			}
		}
		
		for (int[] is : matrizSoma) {
			System.out.println(Arrays.toString(is));
		}
		
	
	}

}

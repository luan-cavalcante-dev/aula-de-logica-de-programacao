package cap6matrixdiagonal1;

import java.util.Scanner;

public class Somadematrixdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// informando matrix
		
		int[][] matriz = new int [3][3];
		
		Scanner leitor = new Scanner (System.in);

		// informação do usuario
		
		System.out.println("Insira os elementos da matriz:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("Elemtento [" +i+"]["+j+"]:");
					matriz[i][j] = leitor.nextInt();
				
				}
				
			}
			// calculando matriz na diagonal
			
			int somaDiagonal = 0;
			for (int i = 0; i < 3; i++) {
				somaDiagonal += matriz[i][i];
			}
			
			// Lendo a soma
			System.out.println("A soma diagonal princial" + somaDiagonal);
	}

}

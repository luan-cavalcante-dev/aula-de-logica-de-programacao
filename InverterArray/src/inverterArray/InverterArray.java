package inverterArray;

public class InverterArray {

	public static void main(String[] args) {
		int[] arrayInt = { 1, 2, 3, 4, 5, 6 };
		int[] arrayInvertida = new int[6];
		
		for(int contador = 0; contador < arrayInt.length; contador++) {
			int comprimentoArray = arrayInt.length;
			arrayInvertida[contador] = arrayInt[comprimentoArray- (contador +1)];
		}
		for (int inteiro : arrayInvertida) {
			System.out.println(inteiro);
		}
		
	}

}

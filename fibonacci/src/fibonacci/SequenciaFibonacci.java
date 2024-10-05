package fibonacci;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarandovariavel
		int maximoExibicao = 10;
		int valoranterior1 =0;
		int valoranterior2 =0;
		int contador = 0;
		//criando repetições
		
		while(contador < maximoExibicao) {
			int somaAnteriores;
			if(valoranterior1 == 0 || valoranterior2 == 0 ) {
				somaAnteriores=1;
			}else {
				somaAnteriores = valoranterior1 + valoranterior2;
			}
			
			System.out.println(somaAnteriores);
			
			valoranterior2 = valoranterior1;
			valoranterior1 = somaAnteriores;
			
			contador ++;
		}
		
		
		

	}

}


package listaexercicos3;
import java.util.Scanner;

public class anobisexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaração ano bisexto
		
		int ano;
		System.out.println("Isira o ano.");
		Scanner leitor =new Scanner(System.in);
		ano = leitor.nextInt();
		int restoAno = ano % 100;
		
		if(restoAno == 00) {
			if( ano % 400 == 0) {
				System.out.println("O Ano é bisexto");
			} else {
				System.out.println("O ano não pe bisexto");
				
			}
			
			
		} else if (restoAno % 4 == 0) {
			System.out.println("O Ano é bisexto");
		} else {
			System.out.println(" O Ano não é bisexto");
			
		}
		
		//resto de ano == 00?
			//se sim é multiplo de 400?
				//se sim OK
				// se não false
		//verificar se 2 ultimo dig são multiplo de 4
			//se sim = ok
			//se não false
		
		
		
	}

}

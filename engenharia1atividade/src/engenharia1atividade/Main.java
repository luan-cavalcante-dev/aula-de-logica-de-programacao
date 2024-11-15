package engenharia1atividade;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		 // leitor
		Scanner scanner = new Scanner (System.in);		
	
		// Lendo Informação do usuário
		
		System.out.println("Informe o nome do funcionário:");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o salário brunto do funcionario");
		double salarioBruto = scanner.nextDouble();
		
		System.out.println("Informe o imposto a ser descontado(em porcetagem e sem o sinal de %):");
		double imposto = scanner.nextDouble();
		
		// criando o objeto funcionario
		Employee funcionarioUm = new Employee (nome, salarioBruto, imposto);
		funcionarioUm.imprimirDados();
		
		// criando o acrescimo em porcentagem
		funcionarioUm.imprimirNovosDados();
		
		
		scanner.close();
		
	}
}

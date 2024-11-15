package engenharia1atividade;
import java.util.Scanner;

public class Employee {

		
	// Atributos
	private String name;
	private double grossSalary;
	private double tax;
	
	
	// Método construtor
	public Employee (String Name, double GrossSalary, double Tax) {
	this.name = Name;
	this.grossSalary = GrossSalary;
	this.tax = Tax;
	
	}
	
	
	// Getters e Setters
	public String getName() {
	
		return name;
	
	}
	
	public void setName(String name) {
	
		this.name = name;
	
	}
	
	public double getGrossSalary() {
	
		return grossSalary;
	
		}
	
	public void setGrossSalary(double grossSalary) {
	this.grossSalary = grossSalary;
	
		}
	
	public double getTax() {
	
		return tax;
	
	
		}
	
	public void setTax(double tax) {
	
		this.tax = tax;
	
	  }
	
	
	// Método para calcular salário líquido
	public double salarioLiquido () {
	
		double liquido = grossSalary - ( grossSalary * (tax/100));
		return liquido;
	
	  }
	
	
	// Método para imprimir dados na tela
	public void imprimirDados () {
	
		System.out.println();
		System.out.println("DADOS DO FUNCIONÁRIO");
		System.out.println("NOME: " + name);
		System.out.println("SALÁRIO LÍQUIDO: R$" + salarioLiquido());
		System.out.println();
	
	 }
	
	//Método para aumentar salário bruto
	
	public void aplicarAcrescimo() {
		
		Scanner scanner = new Scanner (System.in);
	
		System.out.println("Informe a porentagem (apenas número, sem o simbolo%):");
		
	
		double porcentagem = scanner.nextDouble();
	
		grossSalary = grossSalary + (grossSalary * (porcentagem/100));
	
		scanner.close();
	 }
	public void imprimirNovosDados () {
	
		System.out.println();
		System.out.println("DADOS DO FUNCIONÁRIO");
		System.out.println("NOME: " + name);
		System.out.println("SALÁRIO COM ACRESCIMO: R$" + grossSalary);
		System.out.println();
	
	
	}


	
		
	}






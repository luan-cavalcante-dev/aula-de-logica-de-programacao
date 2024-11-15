package buscadeproduto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Busca_de_produto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Função para pedir ao usuario escolher a busca
		System.out.println("Buscar por: 1. Nome");
		System.out.println("Buscar por: 2. Código");
		int tipoBusca = leitor.nextInt();
		leitor.nextLine(); 
		
		// função para pedir ao usuario o valor de busca
		System.out.println("Digite o valor de busca: ");
		String valorBusca = leitor.nextLine();
		
		// Nome do arquivo onde os produtos estão armazenados
		
		String nomeArquivo = "arquivodobartolomeu.csv";
		
		try {
			// Abrindo os arquivos para leitura
			FileReader arquivoReader = new FileReader(nomeArquivo);
			BufferedReader leitor1 = new BufferedReader(arquivoReader);
			
			String linha;
			boolean produtorEncontrado = false;
			 
			// função para ler arquivo linha por linha
			while((linha = leitor1.readLine()) != null) {
			
				
				// função para dividir linha em partes usando a vírgula para separar
			
			String[] dadosProduto = linha.split(",");
			
			// Verificar se o produto corresponde a busca
			
			if((tipoBusca == 1 && dadosProduto[0].equalsIgnoreCase(valorBusca)) ||
				(tipoBusca == 2 && dadosProduto[1].equals(valorBusca))) {
				
			
			// Lendo o teclado e Mostra na tela infromações de produtos
			
				System.out.println("Produto encontrado: ");
				System.out.println("Nome: " + dadosProduto[0]);
				System.out.println("Código: " + dadosProduto[1]);
				System.out.println("Quantidade: " + dadosProduto[2]);
				System.out.println("Preço: " + dadosProduto[3]);
				System.out.println("Data de Validade: " + dadosProduto[4]);
				
				produtorEncontrado = true;
				break;
			}
			
		}
	
	leitor.close();
	
	// informando o usuario se o produtor não for encontrado
	
	if(!produtorEncontrado) {
		System.out.println("Produto não encontrado. ");
		
	}
		
	// Função para se o Arquivo de um erro 
	} catch (IOException erro) {
	
		// mostrando na tela mensagem de erro
		System.out.println("Ocurreu um erro ao ler o arquivo: " + erro.getMessage());
		
	}
		
		
	}
	
	
}

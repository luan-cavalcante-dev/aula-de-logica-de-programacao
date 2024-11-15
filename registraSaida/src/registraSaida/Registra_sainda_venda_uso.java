package registraSaida;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;



public class Registra_sainda_venda_uso {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		 
		// Leitor para pedir as informações do produto para registrar a saida
		
		System.out.println("Digite o código ou nome do produto para registra a saída: ");
		String codigo = leitor.nextLine();
		String nome = leitor.nextLine();
		System.out.println("Digite a quatidade de saída: ");
		int quantidadeDesaida = leitor.nextInt();
		leitor.nextLine();
		leitor.close();
		// Funçao para o nome de arquivo de estoque 
		String estoque = "estoque.csv";
		String temporario = "temporario.cvs";
		
		
		try {
			// Função para abrir arquivo para leitura e temporario pra digitar
			
			BufferedReader leitor1 = new BufferedReader(new FileReader(estoque));
			BufferedWriter digitar = new BufferedWriter(new FileWriter(temporario));
			
			String linha;
			boolean produtoEncontrado = false;
			
			// função para ler o arquivo linha por liha
			while ((linha = leitor1.readLine()) !=null) {
				
				// metado para dividir linha em partes 
				String[]  codigoproduto= linha.split(",");
				String[] nomedoproduto = linha.split(",");
				
				// verificando se pe o produto que estamos buscando
				if (codigoproduto[1].equals(codigo)) {
					int quantidadeAtual = Integer.parseInt(codigoproduto[2]);
					
					// verificaando a quantidade
					if (quantidadeAtual >= quantidadeDesaida) {
						int novaQuantidade = quantidadeAtual  - quantidadeDesaida;
						codigoproduto[2] = String.valueOf(novaQuantidade);
						produtoEncontrado = true;
						System.out.println("Saída registrada com sucesso");
					} else {
						System.out.println("Quantidade em estoque insuficiente");
						leitor1.close();
						digitar.close();
						return;
					}
						
					if (nomedoproduto[1].equals(nome)) {
						int quantidadAtual2 = Integer.parseInt(nomedoproduto[2]);
							
						if (quantidadAtual2 >= quantidadeDesaida) {
							int novaQuantidade = quantidadAtual2  - quantidadeDesaida;
							nomedoproduto[2] = String.valueOf(novaQuantidade);
							produtoEncontrado = true;
							System.out.println("Saída registrada com sucesso");
						} else {
							System.out.println("Quantidade em estoque insuficiente");
							leitor1.close();
							digitar.close();
							return;
						}
							
					}
							
					
					// escreve se a linha tá atualizada ou não no arquivo temporario
					
					digitar.write(String.join(","  , codigoproduto));
					digitar.newLine();
					digitar.write(String.join("," , nomedoproduto));
					digitar.newLine();									
				}
						
				// verificar se o produto foi encontrado
				
				if(!produtoEncontrado) {
					System.out.println("produto não encontrado.");
					return;
				}
						
				File arquivoOriginal = new File (estoque);
				File arquivotemporario = new File (temporario);
				if (arquivoOriginal.delete()) {
					arquivotemporario.renameTo(arquivoOriginal);
				}else {
					
					System.out.println("Erro ao autualizar o arquivo de estoque!");
									
				}
				
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("rodou o finally");
		}
	}
}
		
	
					
						
			
		
	
			
			
		
	


			

		
			
		
		
	


	
	
						
		
				
				
			
			
			
		
	


		
		
		
	



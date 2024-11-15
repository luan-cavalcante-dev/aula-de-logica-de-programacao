import java.util.Scanner;

package criandoestoque;

public class registrandoSaida {

	// declarando arrays para fazer o armazenamento de produtos e quatidades
	// usando arrays para armazenar até 10 produtos
	static String[] produtos = new String[10];
	static int[] quantidades = new int[10];
	static int totalProdutos = 0;

	// escaneando o teclado
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int escolha;

		// O codigo dentro do metado "do" vai ser executado primeiro
		// Criando uma opção de menu para o usuario escolher
		do {
			mostrarOpcao();
			escolha = leitor.nextInt();
			leitor.nextLine();

			switch (escolha) {
			case 1:
				adicionarProduto(leitor);
				break;
			case 2:
				registarSaida(leitor);
				break;
			case 3:
				mostrarEstoque();
				break;
			case 4:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente");
			}
		} while (escolha != 4);

		leitor.close();
	}

	// mostrando na tela a opção de menu
	static void mostrarOpcao() {
		System.out.println("\n--- Menu---");
		System.out.println("1. Adicionar produto");
		System.out.println("2. Registar Saída");
		System.out.println("3. Mostrar estoque");
		System.out.println("4. Sair");
		System.out.println("Escolha uma opção: ");
	}
	// função para permiti adicionar novos produtos

	static void adicionarProduto(Scanner leitor) {
		if (totalProdutos < 10) {
			System.out.print("Nome do Produto: ");
			String nome = leitor.nextLine();
			System.out.print("Quantidade inicial: ");
			int quantidade = leitor.nextInt();

			produtos[totalProdutos] = nome;
			quantidades[totalProdutos] = quantidade;
			totalProdutos++;

			// Mostrando na tela se foi possivel adicionar o produto

			System.out.println("Produto adicionado com sucesso!");
		} else {
			System.out.println("Limite de produtos atingido!");

		}
	}

	// função para informa o produto e quantidade retirada
	static void registarSaida(Scanner leitor) {
		System.out.println("Nome do produto:  ");
		String nome = leitor.nextLine();
		System.out.println("Quantidade a ser retirada:  ");
		int quantidade = leitor.nextInt();

		for (int i = 0; i < totalProdutos; i++) {
			if (produtos[i].equalsIgnoreCase(nome)) {
				if (quantidades[i] >= quantidade) {
					quantidades[i] -= quantidade;
					System.out.println("Saída registrada com sucesso!");
				} else {
					System.out.println("Quantidade insuficiente em estoque");

				}
				return;

			}
		}
		System.out.println("Produto não encontrado");
	}

	static void mostrarEstoque() {
		System.out.println("\n---Estoque Atual---");
		for (int i = 0; i < totalProdutos; i++) {
			System.out.println(produtos[i] + ": " + quantidades[i]);
		}
	}

}

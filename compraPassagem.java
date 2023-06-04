package listaExerciciosIX;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class compraPassagem {
	private String nome, cpf, destino;
	private int idade;
	private double precoPassagem;
	private boolean gerarRecibo = false;
	Scanner scan = new Scanner(System.in);

	public boolean getGerarRecibo(boolean gerarRecibo) {
		this.gerarRecibo = gerarRecibo;
		return this.gerarRecibo;
	}

	public void leNome() {
		System.out.println("Digite seu nome:");
		nome = scan.nextLine();
	}

	public void leCpf() {
		int condicao = 1;
		do {
			System.out.println("Digite o seu CPF no seguinte padrão: xxx.xxx.xxx-xx " + "(inclua os pontos e barra)");
			cpf = scan.nextLine();
			if (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
				System.out.println("Cadastro de CPF realizado com sucesso!");
				condicao = 2;
			} else
				System.out.println("Cadastro inválido digite novamente:");
		} while (condicao == 1);

	}

	public void leIdade() {
		System.out.println("Digite sua idade:");
		idade = scan.nextInt();
	}

	public void selecionaDestino() {
		int selecionaDestino;

		do {
			System.out.println("- São Paulo --> $250.00\n- Nova York --> $2400.00\n- Berlim --> $3800.00 ");
			System.out.println("Selecione: 1 - São Paulo\n2 - Nova York\n3 - Berlim\n4 - Sair");

			try {
				selecionaDestino = scan.nextInt();
				scan.nextLine();

				switch (selecionaDestino) {
				case 1:
					System.out.println("Destino: São Paulo");
					destino = "São Paulo";
					precoPassagem = 250;
					gerarRecibo = true;
					break;
				case 2:
					System.out.println("Destino: Nova York");
					destino = "Nova York";
					precoPassagem = 2400;
					gerarRecibo = true;
					break;
				case 3:
					System.out.println("Destino: Berlim");
					destino = "Berlim";
					precoPassagem = 3800;
					gerarRecibo = true;
					break;
				case 4:
					System.out.println("Saindo...");
					gerarRecibo = false;
					break;
				default:
					System.out.println("Opção inválida! Digite um valor válido.");
					gerarRecibo = false;
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Apenas números são permitidos. Digite novamente.");
				scan.nextLine();
				gerarRecibo = false;
			}
		} while (!gerarRecibo);
	}

	public String geraPassagem() {
		Random random = new Random();
		int numeroPoltrona = random.nextInt(20) + 1;
		String recibo = "Recibo de Viagem\n\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "CPF: " + cpf
				+ "\n" + "Destino: " + destino + "\n" + "Valor: R$ " + precoPassagem + "\n" + "Poltrona: "
				+ String.format("%02d", numeroPoltrona);
		return recibo;
	}
}
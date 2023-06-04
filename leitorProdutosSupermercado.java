package listaExerciciosIX;

import java.util.Scanner;

public class leitorProdutosSupermercado {
	private String[] produtos = new String[11];
	private double[] precoProdutos = new double[11];

	Scanner scan = new Scanner(System.in);

	public String[] getProdutos() {
		return produtos;
	}

	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}

	public double[] getValorProdutos() {
		return precoProdutos;
	}

	public void setValorProdutos(double[] valorProdutos) {
		this.precoProdutos = valorProdutos;
	}

	public void leNomeProdutos() {
		int i;
		for (i = 1; i < 11; i++) {
			System.out.printf("Digite o nome do produto %d:", i);
			produtos[i] = scan.nextLine();
		}

	}

	public void lePrecoProdutos() {
		int i;
		for (i = 1; i < 11; i++) {
			System.out.printf("Digite o preço do produto %d:", i);
			precoProdutos[i] = scan.nextDouble();
		}
	}

	public String imprimeNomeProdutoseValor() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Produto --- Preço do produto\n");
		for (int i = 1; i < 11; i++) {
			sb.append(String.format("%-20s | %20s\n", produtos[i], String.format("%.2f", precoProdutos[i])));
		}
		return sb.toString();
	}

}

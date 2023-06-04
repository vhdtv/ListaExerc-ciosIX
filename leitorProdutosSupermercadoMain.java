package listaExerciciosIX;

import java.io.FileWriter;
import java.io.PrintWriter;

public class leitorProdutosSupermercadoMain {
	public static void main(String[] args) {
		try {
			leitorProdutosSupermercado leProdutos = new leitorProdutosSupermercado();
			leProdutos.leNomeProdutos();
			leProdutos.lePrecoProdutos();
			FileWriter arquivo = new FileWriter("D:\\Users\\M04062A\\Desktop\\Victor\\itens_supermercado.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			gravarArquivo.println(leProdutos.imprimeNomeProdutoseValor());
			arquivo.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}


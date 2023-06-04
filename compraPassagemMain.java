package listaExerciciosIX;

import java.io.FileWriter;
import java.io.IOException;

public class compraPassagemMain {
	public static void main(String[] args) {
		compraPassagem passagem = new compraPassagem();
		try {
			passagem.leNome();
			passagem.leCpf();
			passagem.leIdade();
			passagem.selecionaDestino();
			if (passagem.getGerarRecibo(true)) {
				FileWriter fileWrite = new FileWriter(
						"C:\\Users\\vhdtv\\OneDrive\\Desktop\\Faculdade\\Programação\\recibo_viajem.txt");
				fileWrite.write(passagem.geraPassagem());
				fileWrite.close();
				System.out.println("Recibo salvo com sucesso!");
			} else {
				System.out.println("Nenhum recibo gerado.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao salvar o recibo: " + e.getMessage());
		}
	}
}

package listaExerciciosIX;

import java.io.FileWriter;
import java.io.PrintWriter;

public class registrarAlunosMain {
	public static void main(String[] args) {
		try {
			registrarAlunos registrar = new registrarAlunos();
			registrar.leNomeAlunos();
			registrar.leNotaFinalAlunos();
			FileWriter arquivo = new FileWriter("D:\\Users\\M04062A\\Desktop\\Victor\\alunos_universidade.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			gravarArquivo.println(registrar.imprimeNomeAlunosNotaAlunos());
			arquivo.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

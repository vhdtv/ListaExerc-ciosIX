package listaExerciciosIX;

import java.util.Scanner;

public class registrarAlunos {
	private String[] nomeAlunos = new String[6];
	private double[] notaFinalAlunos = new double[6];

	Scanner scan = new Scanner(System.in);

	public String[] getNomeAlunos() {
		return nomeAlunos;
	}

	public void setNomeAlunos(String[] nomeAlunos) {
		this.nomeAlunos = nomeAlunos;
	}

	public double[] getNotaFinalAlunos() {
		return notaFinalAlunos;
	}

	public void setNotaFinalAlunos(double[] notaFinalAlunos) {
		this.notaFinalAlunos = notaFinalAlunos;
	}

	public void leNomeAlunos() {
		int i;
		for (i = 1; i < 6; i++) {
			System.out.printf("Digite o nome do aluno %d:", i);
			nomeAlunos[i] = scan.nextLine();
		}

	}

	public void leNotaFinalAlunos() {
		int i;
		for (i = 1; i < 6; i++) {
			System.out.printf("Digite a nota final do aluno %d:", i);
			notaFinalAlunos[i] = scan.nextDouble();
		}
	}

	public String imprimeNomeAlunosNotaAlunos() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome --- Nota\n");
		for (int i = 1; i < 6; i++) {
			sb.append(nomeAlunos[i]).append(" --- ").append(String.format("%.2f", notaFinalAlunos[i])).append("\n");
		}
		return sb.toString();
	}

}

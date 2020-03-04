package RevisaoVetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//declaração
		float notas[];
		
		System.out.println("Quantas notas serão digitadas?");
		int qtdAlunos = in.nextInt();	//scanf("%d", qtdAlunos);
		
		notas = new float[qtdAlunos];
		
		//ler cada uma das notas;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota d@ alun@ " + (i + 1) + ": ");
			notas[i] = in.nextFloat();
		}
		
		System.out.println("Seu vetor de notas está assim: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		//qual a maior nota?
		float maior = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maior)
				maior = notas[i];
		}
		System.out.println("A maior nota: " + maior);
		
		
		//qual a menor nota?
		float menor = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < menor)
				menor = notas[i];
		}
		System.out.println("A menor nota: " + menor);
		
		
		//qual a média da turma?
		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		float media = soma/notas.length;
		System.out.println("A média da turma: " + media);
		
		//quantos alunos aprovados?
		float aprovados = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 7)
				aprovados++;
		}
		System.out.println("A quantidade de aprovados: " + aprovados);
		
		
		//quantos alunos reprovados?
		float reprovados = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 7)
				reprovados++;
		}
		System.out.println("A quantidade de reprovados: " + reprovados);
		
		//quantos notas 10?
		float notas10 = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == 10)
				notas10++;
		}
		System.out.println("A quantidade de notas 10: " + notas10);
		
		
		
	}

}

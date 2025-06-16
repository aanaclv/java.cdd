package Fundamentos02;

import java.util.Scanner;

public class Exemplo01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Digite a quantidade de alunos:");
	int alunos = input.nextInt();
	double notas = 0;
	
	int x = 0;
		while (x < alunos) {
		Scanner input2 = new Scanner(System.in);
		System.out.printf("Digite a nota do aluno: ");
		notas += input.nextDouble();
		x++;
	}
		double MediaAluno = notas/alunos;
		System.out.println(MediaAluno);
		double MediaTurma = MediaAluno/alunos;
		System.out.println(MediaTurma);
		
}
}

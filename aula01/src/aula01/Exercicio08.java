package aula01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a nota 1:");
		nota1 = input.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = input.nextDouble();
		
		media = (nota1+nota2)/2;
		System.out.printf("Média: ", media);
}
}
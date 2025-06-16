package aula01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número:");
		int resp1 = input.nextInt();
		int resp2 = input.nextInt();
		int resp3 = input.nextInt();
		System.out.printf("%d %d %d %n", resp1, resp2, resp3);
		
		int maior;
		
		if (resp1 >= resp2 && resp1 >= resp3) {
			maior = resp1;
			} else if (resp2 >= resp1 && resp2 >= resp3) {
				maior = resp2;
			} else {
				maior = resp3;
				}
		
		System.out.println("O maior número é: " + maior);
		

	}
}

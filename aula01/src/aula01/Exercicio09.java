package aula01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letra;
		
		System.out.println("Digite F ou M: ");
		letra = Character.toLowerCase(input.next().charAt(0));
		
		System.out.println(letra == 'f'?"Feminino":"Masculino");
		
		
		
		
	}

}

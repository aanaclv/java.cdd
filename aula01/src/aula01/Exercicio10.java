package aula01;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		char telefonou;
		System.out.println("Telefonou para a vítima? ");
		telefonou = Character.toLowerCase(input.next().charAt(0));
		
		char localcrime;
		System.out.println("Esteve no local do crime? ");
		localcrime = Character.toLowerCase(input.next().charAt(0));
		
		char moraperto;
		System.out.println("Mora perto da vítima? ");
		moraperto = Character.toLowerCase(input.next().charAt(0));
		
		char devia;
		System.out.println("Devia para a vítima? ");
		devia = Character.toLowerCase(input.next().charAt(0));
		
		char trabalhou;
		System.out.println("Já trabalhou com a vítima? ");
		trabalhou = Character.toLowerCase(input.next().charAt(0));
		
		
		if (telefonou == 's') {
			++soma;} 
		if (localcrime == 's') {
			++soma;
		} if (moraperto == 's') {
			++soma;
		} if (devia == 's') {
			++soma;
		} if (trabalhou == 's') {
			++soma;
		}
		System.out.println(soma);
		System.out.println(soma < 2 ? "Inocente": soma == 2 ? "Suspeito": soma == 3 || soma == 4 ? "Cúmplice":"Assassino");
	}

}

package aula01;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número:");
		double resp = input.nextDouble();
		System.out.println(resp);
		
		System.out.println(resp < 0 ? "Negativo" : resp > 0 ? "Positivo" : "Zero");

	}

}

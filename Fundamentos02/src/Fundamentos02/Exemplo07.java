package Fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = new int [4];
		int b [] = new int [4];
		int c [] = new int [4];
		int d [] = new int [4];
		
		for (int i = 0; i <a.length; i++) {
			System.out.printf("Digite o item %d de A", i);
			a[i] = sc.nextInt();
			System.out.printf("Digite o item %d de B", i);
			b[i] = sc.nextInt();
			System.out.printf("Digite o item %d de C", i);
			c[i] = sc.nextInt();
			System.out.printf("Digite o item %d de D", i);
			d[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		

	}

}

package Fundamentos02;

public class Exemplo06 {

	public static void main(String[] args) {
		int soma3=0,soma5=0,somatotal=0;
		
		for (int i =1; i <= 21; i++) {
			if (i % 3 ==0) {
				soma3++;
			}
				}
		for (int x=1; x <= 21; x++) {
			if (x % 5 == 0) {
				soma5++;
			}
		}
		somatotal = soma3+soma5;
		System.out.println(somatotal);
			}
			
		}
	

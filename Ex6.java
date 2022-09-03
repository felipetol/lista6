package lista.lista6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Insira o indice a ser buscado");
		int indice = sc.nextInt();
		
		if(indice > 0 && indice < 10) {
			int numero = vetor[indice];
			
			for(int i = 1; i <= numero; i++) {
				if(numero % i == 0) {
					System.out.println(i);
				}
			}
		}
		
		
		sc.close();
	}
}

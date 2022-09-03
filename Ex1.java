package lista.lista6;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int qtdNegativos = 0;
		double somaPares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				somaPares += vetor[i];
			}
			if(vetor[i] < 0 ) {
				qtdNegativos++;
			}
		}
		
		System.out.println("Quantidade de números negativos: " + qtdNegativos);
		System.out.println("Soma dos número pares: " + somaPares);
		
		sc.close();
	}
}

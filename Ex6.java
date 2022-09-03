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
		
		System.out.println("Insira o número a ser buscado");
		int num = sc.nextInt();
		
		for(int numero: vetor) {
			if(numero % num == 0 ) {
				System.out.println(numero);
			}
		}
		
		
		sc.close();
	}
}

package lista.lista6;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Leitura do vetor: ");
		double vetor[] = new double[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Insira o código: ");
		int codigo = sc.nextInt();
		
		if(codigo == 0) {
			System.out.println("Programa finalizado");
		} else if(codigo == 1) {
			for (double numero: vetor) {
				System.out.println(numero);
			}
		} else if(codigo == 2) {
			for (int i = vetor.length - 1; i >= 0; i--) {
				System.out.println(vetor[i]);
			}
		} else {
			System.out.println("Código inválido");
		}
		
		sc.close();
	}
}

package lista.lista6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[5];
		double maior = 0;
		double menor = 0;
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um número: ");
			vetor[i] = sc.nextDouble();
			
			soma += vetor[i]; 
			
			if(i == 0) {
				maior = vetor[i];
				menor = vetor[i];
			} else if (vetor[i] > maior) {
				maior = vetor[i];
			} else if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Números do vetor: ");
		for(double numero: vetor) {
			System.out.println(numero);
		}
		
		double media = soma / vetor.length;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + media);
		
		sc.close();
	}
}

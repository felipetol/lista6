package lista.lista6;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[20];
		String vetorRepetidos[] = new String[20];
		
		for (int i = 0; i < vetorRepetidos.length; i++) {
			vetorRepetidos[i] = "";
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int indice = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if(i != j) {
					if(vetor[i] == vetor[j]) {
						boolean contem = false;
						for (int k = 0; k < vetorRepetidos.length; k++) {		
							if(vetorRepetidos[k].equals(Double.toString(vetor[j])))
								contem = true;
						}
						if (!contem) {							
							vetorRepetidos[indice] = Double.toString(vetor[j]);
							indice++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			boolean contem = false;
			for (int j = 0; j < vetorRepetidos.length; j++) {
				if(vetorRepetidos[j].equals(Double.toString(vetor[i]))) {
					contem = true;
				}
			}
			if (!contem) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}

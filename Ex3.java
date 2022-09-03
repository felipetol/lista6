package lista.lista6;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vetor[] = new double[10];
		String repetidos[] = new String[10];
		
		for (int i = 0; i < repetidos.length; i++) {
			repetidos[i] = "";
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira o número: ");
			vetor[i] = sc.nextDouble();
		}
		
		int indice = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (i != j) {					
					if(vetor[i] == vetor[j]) {
						boolean contem = false;
						for (int k = 0; k < repetidos.length; k++) {
							if(repetidos[k].equals(Double.toString(vetor[j]))) {
								contem = true;
							}
						}
						if (!contem) {							
							repetidos[indice] = Double.toString(vetor[j]);
							indice++;
						}
					}
				}
			}
		}
		
		System.out.println("Números repetidos");
		
		for(String numero: repetidos) {
			if(numero != "") {				
				System.out.println(numero);
			}
		}
		
		sc.close();
	}
}

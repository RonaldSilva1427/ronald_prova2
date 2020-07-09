package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		double folhaA = 0;
		
	    double folhaM = 0;
	    
	    double salarioFunc = 0;
		
		int count = 0;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Entre com os salarios dos seus funcionarios:\n");
		
		for (count = 0; count < 150; count++) {

			salarioFunc = leitura.nextDouble();
			
			folhaA = folhaA + salarioFunc;
			
			folhaM = salarioFunc + (salarioFunc * 0.15);
			
		}
		
		System.out.printf("A folha de pagamento atual é de R$ %f", folhaA, "\nA folha de pagamento com aumento de 15% para cada funcionario é R$%f", folhaM);
		
		
		leitura.close();
	}
	
}
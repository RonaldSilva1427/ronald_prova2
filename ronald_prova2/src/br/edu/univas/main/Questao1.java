package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	 public static void main(String[] args) {
		 
	        Scanner leitura = new Scanner(System.in);
	        
	        
	        int[] morador1=new int[12];
	        int[] morador2 = new int[12];
	        int maiorA = 0, menorA = 99999999, mediaA = 0;
	        int maiorB = 0, menorB = 99999999, mediaB = 0;

	        for (int i = 0; i < 12; i++) {
	            System.out.println("digite valor do mes: " + (i + 1));
	            morador1[i] = leitura.nextInt();
	            if (morador1[i] > maiorA) {
	                maiorA = morador1[i];
	            }
	            if (morador1[i] < menorA) {
	                menorA = morador1[i];
	            }

	            mediaA += morador1[i];
	        }

	        System.out.println("Média: " + (mediaA / 12));
	        
	        System.out.println("Maior: " + maiorA);
	        
	        System.out.println("Menor: " + menorA);
	        
	        
	    for (int i = 0; i < 12; i++) {
	        System.out.println("digite valor do mes: " + (i + 1));
	        morador2[i] = leitura.nextInt();
	        if (morador2[i] > maiorB) {
	            maiorB = morador2[i];
	        }
	        if (morador2[i] < menorB) {
	            menorB = morador2[i];
	        }

	        mediaB += morador2[i];
	    }

	    System.out.println("Média: " + (mediaB / 12));
	    
	    System.out.println("Maior: " + maiorB);
	    
	    System.out.println("Menor: " + menorB);
	}
}

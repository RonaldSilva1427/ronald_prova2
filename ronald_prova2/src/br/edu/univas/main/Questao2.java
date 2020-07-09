package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			numero = ler.nextInt();
			switch (numero) {
			case  1 :
				System.out.println("Dó");
				break;
			case  2 :
				System.out.println("RÉ");
				break;
			case  3 :
				System.out.println("MI");
				break;
			case  4 :
				System.out.println("FÁ");
				break;
			case  5 :
				System.out.println("SOL");
				break;
			case  6 :
				System.out.println("LA");
				break;
			case  7 :
				System.out.println("SI");
				break;
				
			}
			
			
		}while(numero != 0);
		
		
		}
		
	}
		
		



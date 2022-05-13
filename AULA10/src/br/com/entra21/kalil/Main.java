package br.com.entra21.kalil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//vars
		String op;
		
		//coding
		do {
			System.out.println("=====CALCULADORA=====");
			System.out.println("1 - Soma\n2 - Repetir 20 vezes\n0 - Sair");
			op = sc.nextLine();
			
			switch(op) {
		
			case "0":
				
				System.out.println("Fechando programa...");
				
				break;
			case "1":
			
				runSoma();
			
				break;
			case "2":
				
				runRepeat20();
				
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		
		}while(!op.equals("0"));
		
	}

	
	// função soma
	private static void runSoma() {

		int soma = 0;
		
		for(byte cont=1;cont <= 15; cont++) {
			
			 System.out.println("Soma = soma + counter,  " + soma + " = " + soma + " + " + cont +  " ==> " + (soma + cont)  );
	            soma = (byte) (soma + cont);
			
		}
		
	}
	
	//função repeat20
 	private static void runRepeat20() {
		
		for(byte cont = 1;cont <= 20;cont++) {
			
			System.out.print("Eu gosto de algoritmos "+(cont%5==0?"\n":""));
			
			/*
			 * if (cont % 5 == 0) {
			 * 
			 * System.out.print("\n");
			 * 
			 * }
			 */
			
		}
		
	}

}

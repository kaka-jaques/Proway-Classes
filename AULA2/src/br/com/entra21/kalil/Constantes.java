package br.com.entra21.kalil;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//VARI�VEIS CONSTANTES
		System.out.println("\n****VARI�VEIS CONSTANTES****\n");
		System.out.println("- PARA A VARI�VEL SER CONSTANTE OU 'FINAL'");
		System.out.println("DEVE-SE COLOCAR 'final' ANTES DE DECLARAR ELA, EXEMPLO:");
		
		final byte idade;
		
		System.out.println("PODE SER ATRIBU�DA UM VALOR S� UMA VEZ");
		System.out.println("DIGITE O VALOR DE IDADE:");
		idade = sc.nextByte();
		System.out.println("Idade � "+idade+" e voc� n�o pode mais muda-l�, sen�o dar� erro no c�digo :)");

		
	}

	
}

package br.com.entra21.kalil;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//VARIÁVEIS CONSTANTES
		System.out.println("\n****VARIÁVEIS CONSTANTES****\n");
		System.out.println("- PARA A VARIÁVEL SER CONSTANTE OU 'FINAL'");
		System.out.println("DEVE-SE COLOCAR 'final' ANTES DE DECLARAR ELA, EXEMPLO:");
		
		final byte idade;
		
		System.out.println("PODE SER ATRIBUÍDA UM VALOR SÓ UMA VEZ");
		System.out.println("DIGITE O VALOR DE IDADE:");
		idade = sc.nextByte();
		System.out.println("Idade é "+idade+" e você não pode mais muda-lá, senão dará erro no código :)");

		
	}

	
}

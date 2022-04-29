package br.com.entra21.kalil;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		//Inicializando a classe Scanner - ADICIONAL
		Scanner sc = new Scanner(System.in);
		
		//Vari�veis FINAIS & Tipos de vari�veis e seus tamanhos - AULA 2
		
		System.out.println("****TIPOS DE VARI�VEIS PRIMITIVAS****\n");
		System.out.println("- byte");
		System.out.println("- short");
		System.out.println("- int");
		System.out.println("- double");
		System.out.println("- float");
		System.out.println("- long\n");
		System.out.println("****�NICA VARIAVEL N�O PRIMITIVA****\n");
		System.out.println("- String\n");
		
		
		
		System.out.println("\n****CAPACIDADE DAS VARI�VEIS****\n");
		System.out.println("The Value of 'Byte' is: "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		System.out.println("The Value of 'Short' is: "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
		System.out.println("The Value of 'Int' is: "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
		System.out.println("The Value of 'Double' is: "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
		System.out.println("The Value of 'Float' is: "+Float.MIN_VALUE+" - "+Float.MAX_VALUE);
		System.out.println("The Value of 'Long' is: "+Long.MIN_VALUE+" - "+Long.MAX_VALUE+"\n");
		
		
		
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

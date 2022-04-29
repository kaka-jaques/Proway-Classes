package br.com.entra21.kalil;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		//Inicializando a classe Scanner - ADICIONAL
		Scanner sc = new Scanner(System.in);
		
		//Variáveis FINAIS & Tipos de variáveis e seus tamanhos - AULA 2
		
		System.out.println("****TIPOS DE VARIÁVEIS PRIMITIVAS****\n");
		System.out.println("- byte");
		System.out.println("- short");
		System.out.println("- int");
		System.out.println("- double");
		System.out.println("- float");
		System.out.println("- long\n");
		System.out.println("****ÚNICA VARIAVEL NÃO PRIMITIVA****\n");
		System.out.println("- String\n");
		
		
		
		System.out.println("\n****CAPACIDADE DAS VARIÁVEIS****\n");
		System.out.println("The Value of 'Byte' is: "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		System.out.println("The Value of 'Short' is: "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
		System.out.println("The Value of 'Int' is: "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
		System.out.println("The Value of 'Double' is: "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
		System.out.println("The Value of 'Float' is: "+Float.MIN_VALUE+" - "+Float.MAX_VALUE);
		System.out.println("The Value of 'Long' is: "+Long.MIN_VALUE+" - "+Long.MAX_VALUE+"\n");
		
		
		
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

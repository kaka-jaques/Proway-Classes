package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float numA, numB;
		
		
		System.out.println("OS OPERADORES S�O: \n Adi��o - +\nSubtra��o - -\nMultiplica��o - *\nDivis�o - /\nResto - %");
		System.out.println("\nDigite dois n�meros");
		
		numA = sc.nextFloat();
		
		System.out.println("Mais um...");
		
		numB = sc.nextFloat();
		
		System.out.println("Adi��o = "+(numA+numB)+"\nSubtra��o = "+(numA-numB)+"\nMultiplica��o = "+(numA*numB)+"\nDivis�o = "+(numA/numB)+"Resto = "+(numA%numB));
		
		
	}

	
}

package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float numA, numB;
		
		
		System.out.println("OS OPERADORES SÃO: \n Adição - +\nSubtração - -\nMultiplicação - *\nDivisão - /\nResto - %");
		System.out.println("\nDigite dois números");
		
		numA = sc.nextFloat();
		
		System.out.println("Mais um...");
		
		numB = sc.nextFloat();
		
		System.out.println("Adição = "+(numA+numB)+"\nSubtração = "+(numA-numB)+"\nMultiplicação = "+(numA*numB)+"\nDivisão = "+(numA/numB)+"Resto = "+(numA%numB));
		
		
	}

	
}

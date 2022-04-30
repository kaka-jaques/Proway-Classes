package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte idade;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite sua idade:"));
		
		if (idade > 17) {
			JOptionPane.showMessageDialog(null, "És maior de idade!");
		}else{
			JOptionPane.showMessageDialog(null, "És de menor!");
		}
		
		//Comparação de Números
		
		short numA, numB;
		
		numA = Short.parseShort(JOptionPane.showInputDialog("Adicione um número A"));
		numB = Short.parseShort(JOptionPane.showInputDialog("Adicione um número B"));
		
		JOptionPane.showMessageDialog(null, "Esse caso poderá acontecer de ser <, > ou =. Click OK para verificar");
		
		if(numA > numB) {
			JOptionPane.showMessageDialog(null, "Número "+numA+" é maior");
		}else if (numA == numB) {
			JOptionPane.showMessageDialog(null, "São iguais!");
		}else {
			JOptionPane.showMessageDialog(null, "Número "+numB+" é maior");
		}
		
	}

	
}

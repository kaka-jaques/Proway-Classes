package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte idade;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite sua idade:"));
		
		if (idade > 17) {
			JOptionPane.showMessageDialog(null, "�s maior de idade!");
		}else{
			JOptionPane.showMessageDialog(null, "�s de menor!");
		}
		
		//Compara��o de N�meros
		
		short numA, numB;
		
		numA = Short.parseShort(JOptionPane.showInputDialog("Adicione um n�mero A"));
		numB = Short.parseShort(JOptionPane.showInputDialog("Adicione um n�mero B"));
		
		JOptionPane.showMessageDialog(null, "Esse caso poder� acontecer de ser <, > ou =. Click OK para verificar");
		
		if(numA > numB) {
			JOptionPane.showMessageDialog(null, "N�mero "+numA+" � maior");
		}else if (numA == numB) {
			JOptionPane.showMessageDialog(null, "S�o iguais!");
		}else {
			JOptionPane.showMessageDialog(null, "N�mero "+numB+" � maior");
		}
		
	}

	
}

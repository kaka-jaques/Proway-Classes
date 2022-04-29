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
	}

}

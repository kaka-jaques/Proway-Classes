package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		
		byte idade;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog("Qual sua idade?"));
		
		JOptionPane.showMessageDialog(null, "Você é de "+(idade>17?"maior":"menor"));
		
		//"Você é de "+(Minha condição?"retorne esse texto se for true" : "retorne esse se for false")
		
	}

}

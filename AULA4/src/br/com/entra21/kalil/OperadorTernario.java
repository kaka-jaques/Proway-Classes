package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		
		byte idade;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog("Qual sua idade?"));
		
		JOptionPane.showMessageDialog(null, "Voc� � de "+(idade>17?"maior":"menor"));
		
		//"Voc� � de "+(Minha condi��o?"retorne esse texto se for true" : "retorne esse se for false")
		
	}

}

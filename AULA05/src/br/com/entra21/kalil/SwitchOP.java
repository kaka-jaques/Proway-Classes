package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class SwitchOP {

	public static void main(String[] args) {
		
		//vars
		byte op;
		
		//intro
		JOptionPane.showMessageDialog(null, "AULA SOBRE SWITCH, APROVEITE!!");
		
		//starting coding
		op = Byte.parseByte(JOptionPane.showInputDialog("Escolha o que desejas: 1-Dinheiro / 2-Carreira / 3-Paz / 4-Um PC Gamer"));
		
		switch(op) {
		case 1:
			JOptionPane.showMessageDialog(null, "Todos precisamos😔");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Foco na aula que você consegue!🙂");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Casou porque então???🤣");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Melhor escolha que você pode fazer!! Parabéns!🥳🥳🥳🥳");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Ué? Nada?? Okay.... ¯\\_(ツ)_/¯");
			break;
		}

	}

}

package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		
		//vars
		byte op;
		
		//starting coding
		JOptionPane.showMessageDialog(null, "Exercício Número 1 de Switch");
		op = Byte.parseByte(JOptionPane.showInputDialog("De qual época do ano você gosta? 1-Primavera / 2-Outono / 3-Inverno / 4-Verão"));
		
		switch (op) {
		case 1:
			JOptionPane.showMessageDialog(null, "Primavera: Clima muito agradável!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Outono: Chegando minha época favorita!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Inverno: Chuva e muitoooo frio! Ótimo pra ficar bem aconchegado em casa :)");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Calor dozinfernooooo, fazer oq neh?....");
			break;
		}
		
	}

}

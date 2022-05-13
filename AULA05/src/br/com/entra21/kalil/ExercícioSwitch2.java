package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class ExercícioSwitch2 {

	public static void main(String[] args) {
		
		//vars
		String op;
		
		//starting coding
		op = JOptionPane.showInputDialog("Qual sua cor favorita");
		
		switch (op) {
		case "verde":
			JOptionPane.showMessageDialog(null, "Shrek é? Num curto muito....");
			break;
		case "azul":
			JOptionPane.showMessageDialog(null, "OPAAA, CRUZEIRENSE?? MÁFIA AZUL? NÃO? okay...");
			break;
		case "amarelo":
			JOptionPane.showMessageDialog(null, "Tenho um carinho por essa cor :)");
			break;
		case "vermelho":
			JOptionPane.showMessageDialog(null, "Essa é a cor da sua nota....");
			break;
		default:
			JOptionPane.showMessageDialog(null, "aff, preguicinha...");
			break;
		}

	}

}

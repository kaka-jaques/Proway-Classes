package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class SwitchIF1 {

	public static void main(String[] args) {
		
		//vars
		final float alturaMin = 1.5f;
		float alturaAtual;
		String nome;
		
		//starting coding
		nome = JOptionPane.showInputDialog("Bem-Vindo ao park sla das quantas, digite seu nome para come�ar:");
		alturaAtual = Float.parseFloat(JOptionPane.showInputDialog("Valeu! Agora seu tamanho:"));

		if(alturaAtual < alturaMin) {
			JOptionPane.showMessageDialog(null, "Sr.(a) "+nome+", voc� n�o tem a altura m�nima para entrar("+alturaMin+"), infelizmente n�o poder� entrar...");
		}else {
			JOptionPane.showMessageDialog(null, "Parab�ns, "+nome+"! Voc� tem altura suficiente para entrar! Aproveite!");
		}
		
	}

}

package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class SwitchIF1 {

	public static void main(String[] args) {
		
		//vars
		final float alturaMin = 1.5f;
		float alturaAtual;
		String nome;
		
		//starting coding
		nome = JOptionPane.showInputDialog("Bem-Vindo ao park sla das quantas, digite seu nome para começar:");
		alturaAtual = Float.parseFloat(JOptionPane.showInputDialog("Valeu! Agora seu tamanho:"));

		if(alturaAtual < alturaMin) {
			JOptionPane.showMessageDialog(null, "Sr.(a) "+nome+", você não tem a altura mínima para entrar("+alturaMin+"), infelizmente não poderá entrar...");
		}else {
			JOptionPane.showMessageDialog(null, "Parabéns, "+nome+"! Você tem altura suficiente para entrar! Aproveite!");
		}
		
	}

}

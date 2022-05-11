package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		switch(JOptionPane.showInputDialog("0 - Sair\n1 - Aprender WHILE\n2 - Aprender DO - WHILE").toLowerCase()) {
		
		case "0", "sair":
			
			System.exit(0);
		
			break;
		case "1", "while":
			
			aprenderWhile();
			
			break;
		case "2", "do-while":
			
			aprenderDoWhile();
			
			break;
		default:
			
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
			main(null);
			
			break;
		
		}
		
		JOptionPane.showMessageDialog(null, "Bye!");
		
	}
	
	//função WHILE
	public static void aprenderWhile() {
		
		byte cont = 0;
		
		while(cont < Byte.MAX_VALUE) {
			System.out.println("Contando = "+cont);
			cont++;
		}
		
		String answer = JOptionPane.showInputDialog("Quer entrar na repetição?");
		
		while(answer.equalsIgnoreCase("sim") || answer.equalsIgnoreCase("continuar") || answer.equalsIgnoreCase("dnv") || answer.equalsIgnoreCase("tinovo") || answer.equalsIgnoreCase("quero")) {
			
			answer = JOptionPane.showInputDialog("Quer repetir?");
			
		}
		
		JOptionPane.showMessageDialog(null, "Finish!");
		main(null);
		
	}
	
	//função DO-WHILE
	public static void aprenderDoWhile() {
		
		String answer;
		
		do {
			
			answer = JOptionPane.showInputDialog("Existiam 2 dogs, PITA e REPITA.\nPITA morreu, quem sobrou?");
			
		}while(answer.equalsIgnoreCase("repita"));
		
		JOptionPane.showMessageDialog(null, "Num sabe brincar, num desce pro play |:[ ");
		
	}
	

}

package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class AulaWhile {

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
		
		JOptionPane.showMessageDialog(null, "Finish!");
		main(null);
		
	}
	
	//função DO WHILE
	public static void aprenderDoWhile() {
		
		
		
	}
	

}

package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String var;
		
		JOptionPane.showMessageDialog(null, "Bem vindo! H� duas formas de coletar dados e mostrar ao usu�rio!");
		System.out.println("O FAMOSO 'System.out.println' E O 'JOptionPane'");
		System.out.println("\nPARA LER DADOS, PODEMOS USAR O 'Scanner' OU O 'JOptionPane' TAMB�M");
		System.out.println("\nDIGITE QUALQUER COISA:");
		var = sc.nextLine();
		JOptionPane.showMessageDialog(null, "Por exemplo, voc� digitou: "+var);
		var = JOptionPane.showInputDialog("Agora digite sua pr�xima frase: ");
		System.out.println("AQUI EST�: "+var);
		
	}

}

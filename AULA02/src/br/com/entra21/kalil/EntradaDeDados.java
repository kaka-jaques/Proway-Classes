package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String var;
		
		//MOSTRAR TEXTO
		JOptionPane.showMessageDialog(null, "Bem vindo! H� duas formas de coletar dados e mostrar ao usu�rio!");
		
		//MOSTRAR TEXTO TAMB�M
		System.out.println("O FAMOSO 'System.out.println' E O 'JOptionPane'");
		System.out.println("\nPARA LER DADOS, PODEMOS USAR O 'Scanner' OU O 'JOptionPane' TAMB�M");
		System.out.println("\nDIGITE QUALQUER COISA:");
		
		//ENTRADA DE DADOS POR CONSOLE
		var = sc.nextLine();
		
		//MOSTRANDO DADOS DE ENTRADA
		JOptionPane.showMessageDialog(null, "Por exemplo, voc� digitou: "+var);
		
		//ENTRADA DE DADOS POR CAIXA DE MENSAGEM
		var = JOptionPane.showInputDialog("Agora digite sua pr�xima frase: ");
		
		System.out.println("AQUI EST�: "+var);
		
	}

}

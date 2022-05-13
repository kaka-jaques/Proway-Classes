package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String var;
		
		//MOSTRAR TEXTO
		JOptionPane.showMessageDialog(null, "Bem vindo! Há duas formas de coletar dados e mostrar ao usuário!");
		
		//MOSTRAR TEXTO TAMBÉM
		System.out.println("O FAMOSO 'System.out.println' E O 'JOptionPane'");
		System.out.println("\nPARA LER DADOS, PODEMOS USAR O 'Scanner' OU O 'JOptionPane' TAMBÉM");
		System.out.println("\nDIGITE QUALQUER COISA:");
		
		//ENTRADA DE DADOS POR CONSOLE
		var = sc.nextLine();
		
		//MOSTRANDO DADOS DE ENTRADA
		JOptionPane.showMessageDialog(null, "Por exemplo, você digitou: "+var);
		
		//ENTRADA DE DADOS POR CAIXA DE MENSAGEM
		var = JOptionPane.showInputDialog("Agora digite sua próxima frase: ");
		
		System.out.println("AQUI ESTÁ: "+var);
		
	}

}

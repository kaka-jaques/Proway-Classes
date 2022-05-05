package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Funcoes {

	public static void main(String[] args) {
		
		//vars
		String op;
		
		//starting coding
		op = JOptionPane.showInputDialog("1-Procedimeto\n2-Parametros\n3-Retornos\n4-Completo\n11-Exercício 1\n12-Exercício 2\nEscolha uma opção para entrar na Atividade desejada:");
		
		//chamar funções de acordo com a decisão
		switch(op.toLowerCase()) {
		
		case "procedimento":
		case "1":
			
			procedimentos();
			
			break;
		case "parametros":
		case "2":
			
			parametros(Short.parseShort(JOptionPane.showInputDialog("Digite um número:")));
			
			break;
		case "retornos":
		case "3":
			
			JOptionPane.showMessageDialog(null, "Função retornos() voltou "+retornos());
			
			break;
		case "completo":
		case "4":
			
			JOptionPane.showMessageDialog(null, "Adição de número\nResultado = "+completo(Short.parseShort(JOptionPane.showInputDialog("Digite um número A:")),
					Short.parseShort(JOptionPane.showInputDialog("Digite um número B:"))));
			
			break;
		case "exercicio 1":
		case "11":
			
			exercicio1();
			
			break;
		case "exercicio 2":
		case "12":
			
			exercicio2();
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "OPÇÃO INEXISTENTE!");
			break;
		}

	}
	
	//funções a serem chamadas
	
	//1
	public static void procedimentos() {
		
		//vars
		String text;
		
		//stating coding
		
		//inicializando função e voltando 1
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Você disse: "+text);
		
		//inicializando função e voltando 2
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Você disse: "+text);
		
		//inicializando função e voltando 3
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Você disse: "+text);
		
	}
	
	//2
	public static void parametros(short num) {
		JOptionPane.showMessageDialog(null, "Você escolheu o número "+num+" por meio de parametros!!");
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Um número par! São meus favoritos hehe...");
		}else {
			JOptionPane.showMessageDialog(null, "Número ímpar, porque??");
		}
	}
	
	//3
	public static int retornos() {
		return 10;
	}
	
	//4
	public static int completo(int numA, int numB) {
		JOptionPane.showMessageDialog(null, "Executando o código...");
		return numA+numB;
	}
	
	//11
	public static void exercicio1() {
		
	}
	
	//12
	public static void exercicio2() {
		
	}
	
	//função especifica para mostrar e capturar texto
		public static void catchFrase() {
			JOptionPane.showMessageDialog(null, "Bem vindo!!");
		}
	
}

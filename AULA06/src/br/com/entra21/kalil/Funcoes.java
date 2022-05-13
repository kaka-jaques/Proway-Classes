package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Funcoes {

	public static void main(String[] args) {
		
		//vars
		String op;
		
		//starting coding
		op = JOptionPane.showInputDialog("1-Procedimeto\n2-Parametros\n3-Retornos\n4-Completo\n11-Exerc�cio 1\n12-Exerc�cio 2\nEscolha uma op��o para entrar na Atividade desejada:");
		
		//chamar fun��es de acordo com a decis�o
		switch(op.toLowerCase()) {
		
		case "procedimento":
		case "1":
			
			procedimentos();
			
			break;
		case "parametros":
		case "2":
			
			parametros(Short.parseShort(JOptionPane.showInputDialog("Digite um n�mero:")));
			
			break;
		case "retornos":
		case "3":
			
			JOptionPane.showMessageDialog(null, "Fun��o retornos() voltou "+retornos());
			
			break;
		case "completo":
		case "4":
			
			JOptionPane.showMessageDialog(null, "Adi��o de n�mero\nResultado = "+completo(Short.parseShort(JOptionPane.showInputDialog("Digite um n�mero A:")),
					Short.parseShort(JOptionPane.showInputDialog("Digite um n�mero B:"))));
			
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
			JOptionPane.showMessageDialog(null, "OP��O INEXISTENTE!");
			break;
		}

	}
	
	//fun��es a serem chamadas
	
	//1
	public static void procedimentos() {
		
		//vars
		String text;
		
		//stating coding
		
		//inicializando fun��o e voltando 1
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Voc� disse: "+text);
		
		//inicializando fun��o e voltando 2
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Voc� disse: "+text);
		
		//inicializando fun��o e voltando 3
		catchFrase();
		text = JOptionPane.showInputDialog("Digite uma frase:");
		JOptionPane.showMessageDialog(null, "Voc� disse: "+text);
		
	}
	
	//2
	public static void parametros(short num) {
		JOptionPane.showMessageDialog(null, "Voc� escolheu o n�mero "+num+" por meio de parametros!!");
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Um n�mero par! S�o meus favoritos hehe...");
		}else {
			JOptionPane.showMessageDialog(null, "N�mero �mpar, porque??");
		}
	}
	
	//3
	public static int retornos() {
		return 10;
	}
	
	//4
	public static int completo(int numA, int numB) {
		JOptionPane.showMessageDialog(null, "Executando o c�digo...");
		return numA+numB;
	}
	
	//11
	public static void exercicio1() {
		
	}
	
	//12
	public static void exercicio2() {
		
	}
	
	//fun��o especifica para mostrar e capturar texto
		public static void catchFrase() {
			JOptionPane.showMessageDialog(null, "Bem vindo!!");
		}
	
}

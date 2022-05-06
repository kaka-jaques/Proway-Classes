package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args){
		
		//vars
		String op;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Programa Avaliativo do Entra21!");
		
		//starting coding
		System.out.println("Executando Programa \"Calculadora\"");
		calculadora(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero A:")),Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero B:")));
		
	}
	
	//fun��o
	public static void calculadora(int numA, int numB) {
		
		//vars
		String op;
		byte calc;
		int resul;
		int nextCalcA;
		int nextCalcB;
		
		//menu
		op = JOptionPane.showInputDialog("Digite uma opera��o do c�lculo desejada:\n1 - Adi��o\n2 - Subtra��o\n3 - Divis�o\n4 - Multiplica��o");
		
		//sele��o e processamento
		switch(op.toLowerCase()) {
		case "adi��o":
		case "1":
			
			resul = numA + numB;
			JOptionPane.showMessageDialog(null, numA+"+"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um c�lculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("�timo! Digite um n�mero A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "At� mais!! :)");
				
			}
			
			break;
		case "subtra��o":
		case "2":
			
			resul = numA - numB;
			JOptionPane.showMessageDialog(null, numA+"-"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um c�lculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("�timo! Digite um n�mero A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "At� mais!! :)");
				
			}
			
			break;
		case "divis�o":
		case "3":
			
			resul = numA / numB;
			JOptionPane.showMessageDialog(null, numA+"�"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um c�lculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("�timo! Digite um n�mero A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "At� mais!! :)");
				
			}
			
			break;
		case "multiplica��o":
		case "4":
			
			resul = numA * numB;
			JOptionPane.showMessageDialog(null, numA+"x"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um c�lculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("�timo! Digite um n�mero A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "At� mais!! :)");
				
			}
			
			break;
		}
		
	}

}

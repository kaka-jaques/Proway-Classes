package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args){
		
		//vars
		String op;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Programa Avaliativo do Entra21!");
		
		//starting coding
		System.out.println("Executando Programa \"Calculadora\"");
		calculadora(Integer.parseInt(JOptionPane.showInputDialog("Digite um número A:")),Integer.parseInt(JOptionPane.showInputDialog("Digite um número B:")));
		
	}
	
	//função
	public static void calculadora(int numA, int numB) {
		
		//vars
		String op;
		byte calc;
		int resul;
		int nextCalcA;
		int nextCalcB;
		
		//menu
		op = JOptionPane.showInputDialog("Digite uma operação do cálculo desejada:\n1 - Adição\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
		
		//seleção e processamento
		switch(op.toLowerCase()) {
		case "adição":
		case "1":
			
			resul = numA + numB;
			JOptionPane.showMessageDialog(null, numA+"+"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um cálculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("Ótimo! Digite um número A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "Até mais!! :)");
				
			}
			
			break;
		case "subtração":
		case "2":
			
			resul = numA - numB;
			JOptionPane.showMessageDialog(null, numA+"-"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um cálculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("Ótimo! Digite um número A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "Até mais!! :)");
				
			}
			
			break;
		case "divisão":
		case "3":
			
			resul = numA / numB;
			JOptionPane.showMessageDialog(null, numA+"÷"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um cálculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("Ótimo! Digite um número A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "Até mais!! :)");
				
			}
			
			break;
		case "multiplicação":
		case "4":
			
			resul = numA * numB;
			JOptionPane.showMessageDialog(null, numA+"x"+numB+"="+resul);
			calc = Byte.parseByte(JOptionPane.showInputDialog("Digite 1 para realizar mais um cálculo:\n\nOu digite 2 para sair"));
			
			if(calc == 1) {
				
				nextCalcA = Integer.parseInt(JOptionPane.showInputDialog("Ótimo! Digite um número A"));
				nextCalcB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B:"));
				calculadora(nextCalcA, nextCalcB);

			}else if (calc == 2){
				
				JOptionPane.showMessageDialog(null, "Até mais!! :)");
				
			}
			
			break;
		}
		
	}

}

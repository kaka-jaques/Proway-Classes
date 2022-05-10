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
			
		//seleção e processamento
		switch(JOptionPane.showInputDialog("Digite uma operação do cálculo desejada:\n1 - Adição\n2 - Subtração\n3 - Divisão\n4 - Multiplicação").toLowerCase()) { //APRIMORADO
		case "adição", "1": //APRIMORADO
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"+"+numB+"="+runSoma(numA, numB));
			
			break;
			
		case "subtração", "2":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"-"+numB+"="+runSub(numA, numB));
			
			break;
			
		case "divisão", "3":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"÷"+numB+"="+runDiv(numA, numB));
			
			break;
			
		case "multiplicação", "4":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"x"+numB+"="+runMult(numA, numB));
			
			break;
			
		}
	
		
	}
	
	//função multiplicação
	public static int runMult(int numA, int numB) {
		
		int resul = numA * numB;
		JOptionPane.showMessageDialog(null, numA+"x"+numB+"="+resul);
		return(resul);
		
	}
	
	//função divisão
	public static int runDiv(int numA, int numB) {
		
		int resul = numA / numB;
		JOptionPane.showMessageDialog(null, numA+"÷"+numB+"="+resul);
		return(resul);
		
	}
	
	//função subtração
	public static int runSub(int numA, int numB) {
		
		int resul = numA - numB;
		JOptionPane.showMessageDialog(null, numA+"-"+numB+"="+resul);
		return(resul);
		
	}
	
	//função soma
	public static int runSoma(int numA, int numB) {
		
		int resul = numA + numB;
		JOptionPane.showMessageDialog(null, numA+"+"+numB+"="+resul);
		return(resul);
		
	}
	
	//função repeat
	public static void runRepeat() {
		
		
		
	}
	

}

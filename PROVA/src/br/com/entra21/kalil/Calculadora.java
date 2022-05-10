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
			
		//sele��o e processamento
		switch(JOptionPane.showInputDialog("Digite uma opera��o do c�lculo desejada:\n1 - Adi��o\n2 - Subtra��o\n3 - Divis�o\n4 - Multiplica��o").toLowerCase()) { //APRIMORADO
		case "adi��o", "1": //APRIMORADO
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"+"+numB+"="+runSoma(numA, numB));
			
			break;
			
		case "subtra��o", "2":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"-"+numB+"="+runSub(numA, numB));
			
			break;
			
		case "divis�o", "3":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"�"+numB+"="+runDiv(numA, numB));
			
			break;
			
		case "multiplica��o", "4":
			
			JOptionPane.showMessageDialog(null, "Resultado: "+numA+"x"+numB+"="+runMult(numA, numB));
			
			break;
			
		}
	
		
	}
	
	//fun��o multiplica��o
	public static int runMult(int numA, int numB) {
		
		int resul = numA * numB;
		JOptionPane.showMessageDialog(null, numA+"x"+numB+"="+resul);
		return(resul);
		
	}
	
	//fun��o divis�o
	public static int runDiv(int numA, int numB) {
		
		int resul = numA / numB;
		JOptionPane.showMessageDialog(null, numA+"�"+numB+"="+resul);
		return(resul);
		
	}
	
	//fun��o subtra��o
	public static int runSub(int numA, int numB) {
		
		int resul = numA - numB;
		JOptionPane.showMessageDialog(null, numA+"-"+numB+"="+resul);
		return(resul);
		
	}
	
	//fun��o soma
	public static int runSoma(int numA, int numB) {
		
		int resul = numA + numB;
		JOptionPane.showMessageDialog(null, numA+"+"+numB+"="+resul);
		return(resul);
		
	}
	
	//fun��o repeat
	public static void runRepeat() {
		
		
		
	}
	

}

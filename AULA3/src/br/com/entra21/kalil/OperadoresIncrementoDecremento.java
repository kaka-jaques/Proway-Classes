package br.com.entra21.kalil;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short numA;
		
		//Incremento e Decremento
		numA = Short.parseShort(JOptionPane.showInputDialog("Adicione um n�mero e veja ele sendo I N C R E M E N T A D O ! ! !"));
		
		short numB = numA;
		
		JOptionPane.showMessageDialog(null, "Incrementando por ele mesmo -> "+(numA += numA) );
		JOptionPane.showMessageDialog(null, "Decrementando por ele mesmo -> "+(numA -= numA));
		JOptionPane.showMessageDialog(null, "Seraci funciona com multiplica��o???");
		JOptionPane.showMessageDialog(null, "FUNCIONA SIM!!! "+(numB *= numB));
		
		
		//Pr� incremento e P�s incremento
		numA = Short.parseShort(JOptionPane.showInputDialog("Digite um n�mero que ser� p�s-incrementado por um"));
		JOptionPane.showMessageDialog(null, "Que n�mero voc� acha que sair�? Click OK para verificar");
		
		JOptionPane.showMessageDialog(null, numA++);
		
		JOptionPane.showMessageDialog(null, "Agora sem incrementar -> "+numA);
		
		JOptionPane.showMessageDialog(null, "Agora utilizando o pr�-incremento -> "+(++numA));
		
		
	}
	

}

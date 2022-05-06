package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Signos {

	public static void main(String[] args) {
		
		//vars
		final byte diaMax = 31;
		byte dia;
		byte mes;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Programa Avaliativo do Entra21!");
		
		System.out.println("Executando Programa \"Signos\"");
		
		//starting coding
		dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia em que voc� nasceu:"));
		mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o m�s em que voc� nasceu:"));
		
		if (dia > diaMax) {
			erroDiaIne();
		}else if(dia == 28 && mes == 2 || dia == 31 && mes == 4 || dia == 31 && mes == 6 || dia == 31 && mes == 9 || dia == 31 && mes == 11) {
			erroDiaMes();
		}else {
			JOptionPane.showMessageDialog(null, "Tudo certo! Processando...");
		}
		
		JOptionPane.showMessageDialog(null, signos(dia, mes));
		
	}
	
	//fun��o valida��o
	public static String signos(byte data, byte mes) {
		
		String result;
		
		if(data >= 21 && mes == 3 || data <= 20 && mes == 4) {
			result = "�ries";
		}else if(data >= 21 && mes == 4 || data <= 20 && mes == 5) {
			result = "Touro";
		}else if(data >= 21 && mes == 5 || data <= 20 && mes == 6) {
			result = "Gemeos";
		}else if(data >= 21 && mes == 6 || data <= 20 && mes == 7) {
			result = "C�ncer";
		}else if(data >= 21 && mes == 7 || data <= 20 && mes == 8) {
			result = "Le�o";
		}else if(data >= 21 && mes == 8 || data <= 20 && mes == 9) {
			result = "Virgem";
		}else if(data >= 21 && mes == 9 || data <= 20 && mes == 10) {
			result = "Libra";
		}else if(data >= 21 && mes == 10 || data <= 20 && mes == 11){
			result = "Escorpi�o";
		}else if(data >= 21 && mes == 11 || data <= 20 && mes == 12) {
			result = "Sagit�rio";
		}else if(data >= 21 && mes == 12 || data <= 20 && mes == 1) {
			result = "Capric�rnio";
		}else if(data >= 21 && mes == 1 || data <= 18 && mes == 2) {
			result = "Aqu�rio";
		}else {
			result = "Peixes";		
		}
		
		return(result);
		
	}

	//fun��o erro 1
	public static void erroDiaIne() {
	JOptionPane.showMessageDialog(null, "ERRO! DIA INEXISTENTE!");
	main(null);
	}

	//fun��o erro 2
	public static void erroDiaMes() {
	JOptionPane.showMessageDialog(null, "ERRO! DIA DO M�S INEXISTENTE!");
	main(null);
	}

	
}

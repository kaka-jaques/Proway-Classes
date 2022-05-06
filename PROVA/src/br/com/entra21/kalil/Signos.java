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
		dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia em que você nasceu:"));
		mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês em que você nasceu:"));
		
		if (dia > diaMax) {
			erroDiaIne();
		}else if(dia == 28 && mes == 2 || dia == 31 && mes == 4 || dia == 31 && mes == 6 || dia == 31 && mes == 9 || dia == 31 && mes == 11) {
			erroDiaMes();
		}else {
			JOptionPane.showMessageDialog(null, "Tudo certo! Processando...");
		}
		
		JOptionPane.showMessageDialog(null, signos(dia, mes));
		
	}
	
	//função validação
	public static String signos(byte data, byte mes) {
		
		String result;
		
		if(data >= 21 && mes == 3 || data <= 20 && mes == 4) {
			result = "Áries";
		}else if(data >= 21 && mes == 4 || data <= 20 && mes == 5) {
			result = "Touro";
		}else if(data >= 21 && mes == 5 || data <= 20 && mes == 6) {
			result = "Gemeos";
		}else if(data >= 21 && mes == 6 || data <= 20 && mes == 7) {
			result = "Câncer";
		}else if(data >= 21 && mes == 7 || data <= 20 && mes == 8) {
			result = "Leão";
		}else if(data >= 21 && mes == 8 || data <= 20 && mes == 9) {
			result = "Virgem";
		}else if(data >= 21 && mes == 9 || data <= 20 && mes == 10) {
			result = "Libra";
		}else if(data >= 21 && mes == 10 || data <= 20 && mes == 11){
			result = "Escorpião";
		}else if(data >= 21 && mes == 11 || data <= 20 && mes == 12) {
			result = "Sagitário";
		}else if(data >= 21 && mes == 12 || data <= 20 && mes == 1) {
			result = "Capricórnio";
		}else if(data >= 21 && mes == 1 || data <= 18 && mes == 2) {
			result = "Aquário";
		}else {
			result = "Peixes";		
		}
		
		return(result);
		
	}

	//função erro 1
	public static void erroDiaIne() {
	JOptionPane.showMessageDialog(null, "ERRO! DIA INEXISTENTE!");
	main(null);
	}

	//função erro 2
	public static void erroDiaMes() {
	JOptionPane.showMessageDialog(null, "ERRO! DIA DO MÊS INEXISTENTE!");
	main(null);
	}

	
}

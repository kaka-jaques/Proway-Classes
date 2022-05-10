package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class Signos {

	public static void main(String[] args) {
		
		//vars
		byte dia;
		byte mes;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Programa Avaliativo do Entra21!");
		
		System.out.println("Executando Programa \"Signos\"");
		
		//starting coding
		dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia em que voc� nasceu:"));
		mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o m�s em que voc� nasceu:"));
		
		valDate(dia, mes);
		
		JOptionPane.showMessageDialog(null, signos(dia, mes));
		repeat();
		
	}
	
	//fun��o validar dia e m�s - APRIMORADO
		public static void valDate(byte dia, byte mes) {
			
			//vars
			final byte MAXDIA = 31;
			final byte MINDIAMES = 0;
			final byte MAXMES = 12;
			
			if (dia > MAXDIA || dia < MINDIAMES) {
				erroDiaIne(dia);
			}else if(mes > MAXMES || mes < MINDIAMES){
				erroMes(mes);
			}else if(dia > MAXDIA && mes > MAXMES || dia < MINDIAMES && mes < MINDIAMES) {
				erroTotal(dia, mes);
			}else if(dia >= 28 && mes == 2 || dia >= 31 && mes == 4 || dia >= 31 && mes == 6 || dia >= 31 && mes == 9 || dia >= 31 && mes == 11) {
				erroDiaMes(dia, mes);
			}else {
				JOptionPane.showMessageDialog(null, "Tudo certo! Processando...");
			}
			
			
		}
	
	//fun��o valida��o do signo - ISSUE
	public static String signos(byte data, byte mes) {
		
		final String RESULT;
		
		if(data >= 21 && mes == 3 || data <= 20 && mes == 4) {
			RESULT = "�ries";
		}else if(data >= 21 && mes == 4 || data <= 20 && mes == 5) {
			RESULT = "Touro";
		}else if(data >= 21 && mes == 5 || data <= 20 && mes == 6) {
			RESULT = "Gemeos";
		}else if(data >= 21 && mes == 6 || data <= 20 && mes == 7) {
			RESULT = "C�ncer";
		}else if(data >= 21 && mes == 7 || data <= 20 && mes == 8) {
			RESULT = "Le�o";
		}else if(data >= 21 && mes == 8 || data <= 20 && mes == 9) {
			RESULT = "Virgem";
		}else if(data >= 21 && mes == 9 || data <= 20 && mes == 10) {
			RESULT = "Libra";
		}else if(data >= 21 && mes == 10 || data <= 20 && mes == 11){
			RESULT = "Escorpi�o";
		}else if(data >= 21 && mes == 11 || data <= 20 && mes == 12) {
			RESULT = "Sagit�rio";
		}else if(data >= 21 && mes == 12 || data <= 20 && mes == 1) {
			RESULT = "Capric�rnio";
		}else if(data >= 21 && mes == 1 || data <= 18 && mes == 2) {
			RESULT = "Aqu�rio";
		}else {
			RESULT = "Peixes";		
		}
		
		return(RESULT);
		
		
	}
	
	
	//fun��o erro DIA
	public static void erroDiaIne(int dia) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" � INEXISTENTE!");
		main(null);
	
	}
	
	//fun��o erro M�S
	public static void erroMes(int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! M�S "+mes+" � INEXISTENTE!");
		main(null);
		
	}

	
	//fun��o erro DIA do M�S
	public static void erroDiaMes(int dia, int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" NO M�S "+mes+" � INEXISTENTE!");
		main(null);
	
	}
	
	//fun��o erro DIA e M�S
	public static void erroTotal(int dia, int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" E "+mes+" M�S S�O INEXISTENTE!");
		main(null);
		
	}
	
	
	//fun��o repeat - APRIMORADO
	public static void repeat() {
		switch(JOptionPane.showInputDialog("REPETIR PROGRAMA? (Sim ou N�o)").toLowerCase()) { //APRIMORADO
		case "sim":
			main(null);
			break;
		case "n�o":
			JOptionPane.showMessageDialog(null, "Thanks! :)");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			repeat();
			break;
			
		}
		
		
	}

	
}

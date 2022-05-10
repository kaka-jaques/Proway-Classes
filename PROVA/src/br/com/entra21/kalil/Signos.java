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
		dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia em que você nasceu:"));
		mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês em que você nasceu:"));
		
		valDate(dia, mes);
		
		JOptionPane.showMessageDialog(null, signos(dia, mes));
		repeat();
		
	}
	
	//função validar dia e mês - APRIMORADO
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
	
	//função validação do signo - ISSUE
	public static String signos(byte data, byte mes) {
		
		final String RESULT;
		
		if(data >= 21 && mes == 3 || data <= 20 && mes == 4) {
			RESULT = "Áries";
		}else if(data >= 21 && mes == 4 || data <= 20 && mes == 5) {
			RESULT = "Touro";
		}else if(data >= 21 && mes == 5 || data <= 20 && mes == 6) {
			RESULT = "Gemeos";
		}else if(data >= 21 && mes == 6 || data <= 20 && mes == 7) {
			RESULT = "Câncer";
		}else if(data >= 21 && mes == 7 || data <= 20 && mes == 8) {
			RESULT = "Leão";
		}else if(data >= 21 && mes == 8 || data <= 20 && mes == 9) {
			RESULT = "Virgem";
		}else if(data >= 21 && mes == 9 || data <= 20 && mes == 10) {
			RESULT = "Libra";
		}else if(data >= 21 && mes == 10 || data <= 20 && mes == 11){
			RESULT = "Escorpião";
		}else if(data >= 21 && mes == 11 || data <= 20 && mes == 12) {
			RESULT = "Sagitário";
		}else if(data >= 21 && mes == 12 || data <= 20 && mes == 1) {
			RESULT = "Capricórnio";
		}else if(data >= 21 && mes == 1 || data <= 18 && mes == 2) {
			RESULT = "Aquário";
		}else {
			RESULT = "Peixes";		
		}
		
		return(RESULT);
		
		
	}
	
	
	//função erro DIA
	public static void erroDiaIne(int dia) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" É INEXISTENTE!");
		main(null);
	
	}
	
	//função erro MÊS
	public static void erroMes(int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! MÊS "+mes+" É INEXISTENTE!");
		main(null);
		
	}

	
	//função erro DIA do MÊS
	public static void erroDiaMes(int dia, int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" NO MÊS "+mes+" É INEXISTENTE!");
		main(null);
	
	}
	
	//função erro DIA e MÊS
	public static void erroTotal(int dia, int mes) {
		
		JOptionPane.showMessageDialog(null, "ERRO! DIA "+dia+" E "+mes+" MÊS SÃO INEXISTENTE!");
		main(null);
		
	}
	
	
	//função repeat - APRIMORADO
	public static void repeat() {
		switch(JOptionPane.showInputDialog("REPETIR PROGRAMA? (Sim ou Não)").toLowerCase()) { //APRIMORADO
		case "sim":
			main(null);
			break;
		case "não":
			JOptionPane.showMessageDialog(null, "Thanks! :)");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
			repeat();
			break;
			
		}
		
		
	}

	
}

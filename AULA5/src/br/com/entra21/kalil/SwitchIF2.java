package br.com.entra21.kalil;

import javax.swing.JOptionPane;

public class SwitchIF2 {

	public static void main(String[] args) {
		
		//vars
		final byte QuantNotas = 4;
		final byte nota1;
		final byte nota2;
		final byte nota3;
		final byte nota4;
		final float media;
		String nome;
		
		//starting coding
		nome = JOptionPane.showInputDialog("Digite o nome do Aluno:");
		
		nota1 = Byte.parseByte(JOptionPane.showInputDialog("Digite a nota do aluno:"));
		nota2 = Byte.parseByte(JOptionPane.showInputDialog("Digite a nota do aluno:"));
		nota3 = Byte.parseByte(JOptionPane.showInputDialog("Digite a nota do aluno:"));
		nota4 = Byte.parseByte(JOptionPane.showInputDialog("Digite a nota do aluno:"));
		
		media = (nota1+nota2+nota3+nota4)/QuantNotas;
		
		if(media < 3) {
			JOptionPane.showMessageDialog(null, nome+" foi REPROVADO! tirou "+media);
		}else if(media < 7) {
			JOptionPane.showMessageDialog(null, nome+" est� de RECUPERA��O! tirou "+media);
		}else if(media == 7) {
			JOptionPane.showMessageDialog(null, nome+" passou na M�DIA! tirou "+media);
		}else if(media < 10) {
			JOptionPane.showMessageDialog(null, nome+" passou mas poderia ser MELHOR! tirou "+media);
		}else if(media == 10) {
			JOptionPane.showMessageDialog(null, nome+" tirou nota M�XIMA! tirou "+media);
		}
		
	}

}//poderia ser melhor com repeti��o FOR ou WHILE

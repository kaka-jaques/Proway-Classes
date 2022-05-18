package br.com.entra21.kalil;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte op;
		
		do {
			
			System.out.println(escreverMenuMatrizes());
			op = sc.nextByte();
			
			switch(op) {
			case 0:
				
				System.out.println("Saindo...");
				
				break;
			case 1:
				
				aprenderMatrizesSimples();
				
				break;
			case 2:
				
				aprenderMatrizesInicializadas();
				
				break;
			default:
				
				System.out.println("Opção Inválida!");
				
				break;
			}
			
		}while(op != 0);
		
	}
	
	//função matriz menu
	public static String escreverMenuMatrizes() {
		
		String conteudoMenu = "";
		
		return conteudoMenu;
		
	}
	
	//função matriz simples
	public static void aprenderMatrizesSimples() {
		
		byte qtdAlunos, qtdNotas;
		
		System.out.println("Aprendendo Matrizes Simples");
		
		System.out.println("Armazenar as 3 notas de todos os 10 alunos");
		
		float notas[][];
		
		System.out.println("Digite a quantidade de alunos");
		qtdAlunos = sc.nextByte();
		System.out.println("Digite a quantidade notas por aluno");
		qtdNotas = sc.nextByte();
		
		//usuário definindo a matriz
		
		notas = new float[qtdAlunos][qtdNotas];
		//primeiro índice é a quantidade de vetores
		//o segundo é a capacidade (em vetores) de cada vetor
		//apenas no último índice que é armazenado o valor
		
		for(byte aluno=0;aluno<notas.length;aluno++) {
			
			System.out.println("Nessa posição ("+aluno+") temos "+notas[aluno].length+"notas");
			
			
		}
		
	}
	
	//função matriz inicializada
	public static void aprenderMatrizesInicializadas() {
		
		System.out.println("Aprendendo Matrizes ");
		
	}

}

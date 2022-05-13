package br.com.entra21.kalil;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//vars
		String op;
		
		//coding
		do {
			System.out.println("=====CALCULADORA=====");
			System.out.println("1 - Soma\n2 - Repetir 20 vezes\n3 - Somar idades\n4 - Exibir os mais velhos\n5 - Exibir os mais novos\n6 - Ler 20 n�mero e exibir quantos s�o pares\n7 - \n8 - \n9 - M�dia de Alunos\n0 - Sair");
			op = sc.nextLine();
			
			switch(op) {
		
			case "0":
				
				System.out.println("Fechando programa...");
				
				break;
			case "1":
			
				runSoma();
			
				break;
			case "2":
				
				runRepeat20();
				
				break;
			case "3":
				
				sumAge();
				
				break;
			case "4":
				
				maioresDeIdade();
				
				break;
			case "5":
				
				exibirMaisNovo();
				
				break;
			case "6":
				
				runPares();
				
				break;
			case "9":
				
				mediaAlunos();
				
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		
		}while(!op.equals("0"));
		
	}

	
	// fun��o soma - EXERC�CIO 1 (ARIANA)
	private static void runSoma() {

		int soma = 0;
		
		for(byte cont=1;cont <= 15; cont++) {
			
			 System.out.println("Soma = soma + counter,  " + soma + " = " + soma + " + " + cont +  " ==> " + (soma + cont)  );
	            soma = (byte) (soma + cont);
			
		}
		
	}
	
	//fun��o repeat20 - EXERC�CIO 2 (KALIL)
 	private static void runRepeat20() {
		
		for(byte cont = 1;cont <= 20;cont++) {
			
			System.out.print("Eu gosto de algoritmos "+(cont%5==0?"\n":""));
			
			/*
			 * if (cont % 5 == 0) {
			 * 
			 * System.out.print("\n");
			 * 
			 * }
			 */
			
		}
		
	}
 	
 	//fun��o 3 - EXERC�CIO 3 (EMERSON)
	public static void sumAge() {
		
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 5; count++) {
			System.out.println("No momento a soma est� em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

		}

		System.out.println("A soma total das idades foi " + sumAge);

	}
	
	//fun��o exibir o maior de idade - EXERC�CIO 4 (STEPHANIE)
	private static void maioresDeIdade() {
        System.out.println("Exibir apenas os maiores de idade");
        byte maiores = 0;
        byte idade, cont;

 

        Scanner input = new Scanner(System.in);
        
        for (cont = 1; cont <= 20; cont++) {
            System.out.println("Informe a idade da pessoa " + cont);
            idade = input.nextByte();
            if (idade >= 18) {
                maiores++;
                System.out.println("A �ltima pessoa informada era de maior.");
                
            }
            
        }
        
        System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " s�o maiores de idade");
        
    }
 	
 	//fun��o exibir o mais novo - EXERC�CIO 5 (FILIPE)
	private static void exibirMaisNovo() {
		
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			
			// no primeiro la�o sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo la�o j� tenho como comparar com "ageMinimal"
				System.out.println("Estou no la�o " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova � " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		
		System.out.println("Ap�s isso tudo o mais novo �: " + youngerName + " " + ageMinimal);

	}
	
	//fun��o ler 20 n�meros e exibir quantos pares - EXERC�CIO 6 (????)
	public static void runPares() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		byte par = 0;
		
		for(byte cont = 0;cont < 20;cont++ ) {
			
			System.out.println("Digite um n�mero:");
			num = sc.nextInt();
			
			if(num%2==0) {
				par++;
			}
			
		}
		
		System.out.println("Voc� digitou "+par+" n�meros pares!");
		
	}
	
	//fun��o para tirar media de alunos - EXER�CIO 9 (MATEUS FELIPE)
	private static void mediaAlunos() {
		
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				
				if (resposta.equals("sim")) {
					
					contador--;
					
				}
				
			}

			soma = soma + nota;
			
		} while (contador <= qtd);
		
		System.out.println("Soma =" + soma);
		
	}
	

}

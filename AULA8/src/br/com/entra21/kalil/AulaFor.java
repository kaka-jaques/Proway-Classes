package br.com.entra21.kalil;

public class AulaFor {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre For");

		//contador adicionando
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
			System.out.println("-------");

		}

		//contador adicionando de 2 em 2 (ímpar)
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);
			// System.out.println(contador1);
			// Não é possível usar a variavel contador1 pois ela só existe no outro escopo do for

		}
		
		//contador adicionando de 2 em 2 começando por 4 (par)
		for(int contador = 4;contador <= 10; contador+=2) {
			
			System.out.println("Repetindo = "+contador);
			
		}
		
		//contador diminuindo
		for(int contador = 10; contador >=0; contador--) {
			
			System.out.println("Repetindo = "+contador);
			
		}
		
		//contador multiplicando
		for(int contador = 0; contador <= 10; contador++) {
			
			System.out.println("Tabuado do 5: 5x"+contador+"="+(5*contador));
			
		}
		
	}

}

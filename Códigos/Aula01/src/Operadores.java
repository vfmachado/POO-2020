
public class Operadores {

	public static void main(String[] args) {
		
		//adição, subtração, multiplicação e divisão
		float saldo = 0;
		
		saldo = saldo + 1000;
		System.out.println("Seu saldo atual é: " + saldo);
		
		saldo += 500;
		saldo++;
		
		saldo = saldo - 200;
		
		//saldo = saldo * 100;
		saldo *= 100;
		
		saldo = saldo/2;
		
		
		//resto
		//verificar se um número é par
		int num = 14;
		boolean ehPar = num % 2 == 0;
		System.out.println("O valor " + num + " é par? " + ehPar);
		
		//operadores relacionais
		// > >= < <= != == 	|| 	&&
		//resultado de um operador relacional é sempre VERDADEIRO OU FALSO
		
		boolean testeCondicional = 5 > 2; //true
		testeCondicional = 3 == 4; //false
		
		//operador ternário
		int idade = 20;
		String msg = idade >= 18 ?  "Você pode passar" : "Sinto muito, vc é menor de idade";
		
	}

}

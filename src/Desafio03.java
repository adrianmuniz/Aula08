import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

	 * */
	
	public static String existe (int lado1, int lado2, int lado3) {
		int soma = lado1 + lado2;
		if (soma > lado3) {
			return "O triangulo existe";
		}
		return "O triangulo não existe";
	}
	
	public static String tipoTriangulo (int lado1, int lado2, int lado3) {
		if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "O tipo do triangulo é Isósceles";
		} else if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
			return "O tipo do triangulo é Escaleno";
		} else {
			return "O triangulo é equilátero";
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int lado1 =0; 
		int lado2=0; 
		int lado3=0;
		
		System.out.println("Informe o primeiro lado do triangulo!");
		lado1 = leitor.nextInt();
		System.out.println("Informe o segundo lado do triangulo!");
		lado2 = leitor.nextInt();
		System.out.println("Informe o terceiro lado do triangulo!");
		lado3 = leitor.nextInt();
		System.out.println(existe(lado1, lado2, lado3));
		
	}
}

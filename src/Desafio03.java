import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	
	public static String existe (int lado1, int lado2, int lado3) {
		int soma = lado1 + lado2;
		if (soma > lado3) {
			return "O triangulo existe";
		}
		return "O triangulo n�o existe";
	}
	
	public static String tipoTriangulo (int lado1, int lado2, int lado3) {
		if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "O tipo do triangulo � Is�sceles";
		} else if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
			return "O tipo do triangulo � Escaleno";
		} else {
			return "O triangulo � equil�tero";
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

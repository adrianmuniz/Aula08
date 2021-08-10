import java.util.Scanner;

public class Desafio01 {
	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

	 * */
	public static boolean validaEstado(String sigla) {
		String siglas[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI","RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		
		for (int i =0; i<siglas.length; i++) {
			if (siglas[i].equalsIgnoreCase(sigla)) { 
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String estado;
		System.out.println("Digite uma sigla de estado brasileiro");
		estado = leitor.next();
		if (validaEstado(estado)) {
			System.out.println("Existe um estado com essa sigla!");
		} else {
			System.out.println("Não existe nenhum estado com essa sigla!");
		}
		
	}
}

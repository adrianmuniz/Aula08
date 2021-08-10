import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	
	public static void calculoSalario(int aulasSemanais, double horaAula) {
		double aulasMensais, salarioBase, horaAtividade, dsr, total;
		aulasMensais = aulasSemanais * 4.5;
		salarioBase = aulasMensais * horaAula;
		System.out.printf("Valor do sal�rio base � de R$%.2f%n", salarioBase);
		
		horaAtividade = salarioBase * 0.05;
		System.out.printf("Adicional de hora-atividade R$%.2f%n", horaAtividade);
		
		dsr = (salarioBase / 6) + horaAtividade; 
		System.out.printf("Valor do Descanso semanal Remunerado R$%.2f%n", dsr);
		
		total = salarioBase + horaAtividade + dsr;
		System.out.printf("Sal�rio total de R$%.2f",total);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int aulasSemanais;
		double horaAula;
		
		System.out.println("Bem vindo ao programa de c�lculo de sal�rio!");
		System.out.println("Digite a quantidade de aulas semanais ministradas: ");
		aulasSemanais = leitor.nextInt();
		System.out.println("Informe o valor da hora-aula: ");
		horaAula = leitor.nextDouble();
		calculoSalario(aulasSemanais, horaAula);
		
		
		leitor.close();
	}
}

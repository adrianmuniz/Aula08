import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
	 * */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int aulasSemanais;
		double horaAula;
		double salario=0;
		int tipoProfessor = 0;
		int opcao = 0;
		
		Funcoes04.manuProfessores();
		tipoProfessor = leitor.nextInt();
		
		if (tipoProfessor == 1) {
			System.out.println("Para inicar o programa informe o N° de Aulas semanais");
			aulasSemanais = leitor.nextInt();
			System.out.println("Digite o valor da Hora-aula");
			horaAula = leitor.nextDouble();
			
			while (opcao!=5) {
				Funcoes04.menuAulista();
				opcao = leitor.nextInt();
				switch(opcao) {
					case 1:
						System.out.printf("Seu salário base é R$%.2f%n", Funcoes04.salarioAulista(aulasSemanais, horaAula));
						break;
					case 2:
						System.out.printf("O valor da sua Hora-atividade foi de R$%.2f%n" , Funcoes04.horaAtividade(aulasSemanais, horaAula));
						break;
					case 3:
						System.out.printf("Seu DSR foi R$%.2f%n" , Funcoes04.descansoRemunerado(aulasSemanais, horaAula));
						break;
					case 4:
						System.out.printf("Salário total: R$%.2f%n" , Funcoes04.totalAulista(aulasSemanais, horaAula));
						break;
					case 5:
						System.out.println("Saindo do Sistema");
						break;
					default:
						System.out.println("Opção inválida, Por favor escolha outra opção");
					break;
			}
		}
		} else if (tipoProfessor == 2) {
				System.out.println("Digite seu salário");
				salario = leitor.nextDouble();
				while(opcao!= 3) {
					Funcoes04.menuMensalista();
					opcao = leitor.nextInt();
				switch(opcao) {
					case 1:
						System.out.printf("Hora-atividade: R$%.2f%n" , Funcoes04.horaMensalista(salario));
						break;
					case 2:
						System.out.printf("Salário total: R$%.2f%n" , Funcoes04.salarioMensalista(salario));
						break;
					case 3:
						System.out.println("Encerrando Programa");
						break;
					default:
						System.out.println("Opção Inválida, Por favor escolha outra opção");
						break;
				}
			}
		} else {
			System.out.println("Programa finalizado");
		}		
		leitor.close();
	}
}

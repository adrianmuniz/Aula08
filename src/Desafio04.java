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
		int tipoProfessor =0;
		int opcao = 0;
		
		System.out.println("Para inicar o programa informe o N° de Aulas semanais");
		aulasSemanais = leitor.nextInt();
		System.out.println("Digite o valor da Hora-aula");
		horaAula = leitor.nextDouble();
		
		Funcoes04.manuProfessores();
		tipoProfessor = leitor.nextInt();
		
		if (tipoProfessor == 1) {
			while (opcao!=5) {
				Funcoes04.menuCalculos();
				opcao = leitor.nextInt();
			
				switch(opcao) {
					case 1:
						System.out.println("Seu salário base é R$ " + Funcoes04.salarioAulista(aulasSemanais, horaAula));
						break;
					case 2:
						System.out.println("O valor da sua Hora-atividade foi de R$" + Funcoes04.horaAtividade(aulasSemanais, horaAula));
						break;
					case 3:
						System.out.println("Seu DSR foi R$" + Funcoes04.descansoRemunerado(aulasSemanais, horaAula));
						break;
					case 4:
						System.out.println("Salário total: R$" + Funcoes04.salarioTotal(aulasSemanais, horaAula));
						break;
					case 5:
						System.out.println("Saindo do Sistema");
						break;
					default:
						System.out.println("Opção inválida, Por favor escolha outra opção");
					break;
			}
		}
		}
		
		leitor.close();
	}
}

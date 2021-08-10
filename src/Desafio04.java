import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int aulasSemanais;
		double horaAula;
		int tipoProfessor =0;
		int opcao = 0;
		
		System.out.println("Para inicar o programa informe o N� de Aulas semanais");
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
						System.out.println("Seu sal�rio base � R$ " + Funcoes04.salarioAulista(aulasSemanais, horaAula));
						break;
					case 2:
						System.out.println("O valor da sua Hora-atividade foi de R$" + Funcoes04.horaAtividade(aulasSemanais, horaAula));
						break;
					case 3:
						System.out.println("Seu DSR foi R$" + Funcoes04.descansoRemunerado(aulasSemanais, horaAula));
						break;
					case 4:
						System.out.println("Sal�rio total: R$" + Funcoes04.salarioTotal(aulasSemanais, horaAula));
						break;
					case 5:
						System.out.println("Saindo do Sistema");
						break;
					default:
						System.out.println("Op��o inv�lida, Por favor escolha outra op��o");
					break;
			}
		}
		}
		
		leitor.close();
	}
}

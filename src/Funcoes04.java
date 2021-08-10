
public class Funcoes04 {

	
	public static void manuProfessores() {
		System.out.println("ESCOLHA UMA DAS OP��ES");
		System.out.println("1 - Professor Aulista");
		System.out.println("2 - Professor Mensalista");
		System.out.println("3 - Encerrar programa");
	}
	
	public static void menuCalculos() {
		System.out.println("ESCOLHA O CALCULO QUE DESEJA FAZER!");
		System.out.println("1 - Sal�rio base");
		System.out.println("2 - Hora atividade");
		System.out.println("3 - Descanso semanal remunerado");
		System.out.println("4 - Sal�rio Total");
		System.out.println("5 - Fim do Programa");
	}
	
	
	public static double salarioMensalista (double salario) {
		double adicional, salarioTotal=0;
		adicional = salarioTotal * 0.05;
		salarioTotal = salarioTotal + adicional;
		return salarioTotal;
	}
	
	public static double horaMensalista (double salario) {
		double adicional, salarioTotal =0;
		adicional = salarioTotal * 0.05;
		return adicional;
	}
	
	public static double salarioAulista (int aulasSemanais, double horaAula) {
		double aulasMensais, salarioBase;
		aulasMensais = aulasSemanais * 4.5;
		salarioBase = aulasMensais * horaAula;
		return salarioBase;
	}
	
	public static double horaAtividade (int aulasSemanais, double horaAula) {
		double aulasMensais, adicional, salarioBase;
		aulasMensais = aulasSemanais * 4.5;
		salarioBase = aulasMensais * horaAula;
		adicional = salarioBase * 0.05;
		return adicional;
	}
	
	public static double descansoRemunerado (int aulasSemanais, double horaAula) {
		double aulasMensais, adicional, salarioBase, dsr;
		aulasMensais = aulasSemanais * 4.5;
		salarioBase = aulasMensais * horaAula;
		adicional = salarioBase * 0.05;
		dsr = (salarioBase + adicional) / 6;
		return dsr;
	}
	
	public static double salarioTotal (int aulasSemanais, double horaAula) {
		double aulasMensais, adicional, salarioBase, dsr, salarioTotal;
		aulasMensais = aulasSemanais * 4.5;
		salarioBase = aulasMensais * horaAula;
		adicional = salarioBase * 0.05;
		dsr = salarioBase + adicional / 6;
		salarioTotal = salarioBase + adicional + dsr;
		return salarioTotal;
	}
}


public class Funcoes04 {

	
	public static void menuCalculos() {
		System.out.println("ESCOLHA O CALCULO QUE DESEJA FAZER!");
		System.out.println("1 - Salário base");
		System.out.println("2 - Hora atividade");
		System.out.println("3 - Descanso semanal remunerado");
		System.out.println("4 - Salário Total");
		System.out.println("5 - Fim do Programa");
	}
	
	public static double salarioBase (int aulasSemanais, double horaAula) {
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
		dsr = salarioBase + adicional / 6;
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

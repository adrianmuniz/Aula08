
public class Desafio06 {
/*Poker é um jogo muito conhecido pela sua ligação com a matemática, afinal, a partir de uma série de cartas que os jogadores podem ter em mãos, existe uma possibilidade limitada de combinações.
Algumas das combinações são:
•	Par: duas cartas de valores iguais, independente do naipe, e três cartas de valores diferentes.
•	Trinca: três cartas de valores iguais, independente do naipe, e duas cartas de valores diferentes.
•	Flush: todas as cartas do mesmo naipe, independente do valor.
•	Quadra: quatro cartas do mesmo valor, independente do naipe.
•	Função agregadora: passa os dados pelas 4 funções acima e informa o tipo de jogo que o jogador tem.
Supondo um jogo onde os jogadores têm 5 cartas na mão, crie funções para verificar se as 5 cartas formam cada um dos 4 jogos acima.
*/
	
	public static int ocorrenciasIgualdades(String[] cartas) {
		int quantidade = 0;
		for (int i=0; i<cartas.length; i++) {
			for (int i2=0; i2<cartas.length - 1;i2++) {
				if (cartas[i].equals(cartas[i2])) {
					//encontrei cartas iguais
					quantidade++;
				}
			}
		}
		return quantidade;
	}
	
	public static void main(String[] args) {
		//String[] valoresCartas = new String[5];
		String[] valoresCartas = {"A","1","2","9","K"};
		String[] naipeCartas = new String[5];
		
		
		
	}

}

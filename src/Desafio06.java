
public class Desafio06 {
/*Poker � um jogo muito conhecido pela sua liga��o com a matem�tica, afinal, a partir de uma s�rie de cartas que os jogadores podem ter em m�os, existe uma possibilidade limitada de combina��es.
Algumas das combina��es s�o:
�	Par: duas cartas de valores iguais, independente do naipe, e tr�s cartas de valores diferentes.
�	Trinca: tr�s cartas de valores iguais, independente do naipe, e duas cartas de valores diferentes.
�	Flush: todas as cartas do mesmo naipe, independente do valor.
�	Quadra: quatro cartas do mesmo valor, independente do naipe.
�	Fun��o agregadora: passa os dados pelas 4 fun��es acima e informa o tipo de jogo que o jogador tem.
Supondo um jogo onde os jogadores t�m 5 cartas na m�o, crie fun��es para verificar se as 5 cartas formam cada um dos 4 jogos acima.
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

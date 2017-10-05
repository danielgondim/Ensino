import java.util.Random;
import java.util.Scanner;

/**
 * Um jogo de sorte para bebês. <br>
 * Importante: Este programa é apenas ilustrativo. Um exemplo de uso
 * de exceções para os alunos irem se familiarizando com a sintaxe.
 * Na pratica, exceções são usadas para indicar erros.
 * 
 * @author raquel
 * 
 */

public class LancaExcecoes {
	public static final int NUM_JOGADAS = 5;
	private static int picoles;
	private static int bombas;
	public static void main(String[] args) {
		doIt();
		// System.out.printf("Sorte = %d; Num. de derrotas = %d\n", picoles,
		// bombas);
	}

	private static void doIt() {
		int jogada = 1;
		while (jogada++ <= NUM_JOGADAS) {
			prompt();
			try {
				lanca();
				picoles++;
			} catch (Exception e) {
				bombas++;
				System.out.println(e.getMessage());
			} finally { // codigo optativo
				System.out.println("Fim da jogada " + (jogada - 1));
				System.out.printf("Sorte = %d; Num. de derrotas = %d\n",
						picoles, bombas);
			}
		}
	}

	private static void lanca() throws Exception {
		Random rand = new Random();
		if (rand.nextBoolean()) {
			throw new Exception("Bomba!");
			// qq codigo aqui dah erro de compilacao
			// System.out.println("vai dar erro :P");
		}
		System.out.println("Picolé!");
	}

	private static void prompt() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Aperte <enter> para a proxima jogada.");
		scn.nextLine();
	}
}
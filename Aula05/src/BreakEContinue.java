// Programa feio e sem utilidade, para demonstrar uso de break e continue
public class BreakEContinue {

	public static void main(String[] args) {
		// imprime os numeros entre 0 e 78 que sao multiplos de 9
		for (int i = 0; i < 100; i++) {
			if (i == 78)
				break; // sai do loop for
			if (i % 9 != 0)
				continue; // volta para o inicio do loop for
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// imprime todos os multiplos menores que 78, de 4, de 5... até 9
		for (int i = 4; i < 10; i++) {
			int j = 0;
			while (j++ < 100) {
				if (j == 78)
					break; // sai do loop while
				if (j % i != 0)
					continue; // volta para o inicio do loop while
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
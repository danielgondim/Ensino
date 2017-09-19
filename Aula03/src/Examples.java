public class Examples {

	public static void main(String[] args) {
		System.out.println(maiorNumeroModoUm(10, 5));
		System.out.println(maiorNumeroModoDois(10, 5));

		// Definindo algumas variáveis com tipos primitivos de Java
		boolean éBoolean = true;
		char letra = 'd';
		byte meuByte = -128;
		short num1 = 1000;
		int num2 = 481648;
		long num3 = 12982318273L;
		float num4 = 81478614564286.425814574524F;
		double num5 = 148648534.864836436;

		// convertendo tipos
		int num6 = (int) num5;
		System.out.println("O numero convertido é: " + num6);

		// operadores
		System.out.println("A soma: " + num1 + num2);
		System.out.println("A subtração: " + (num1 - num2));
		System.out.println("A multiplicação: " + num1 * num2);
		System.out.println("A divisão: " + num2 / num1);
		System.out.println("O módulo: " + 10 % 3);

		int negativo = -40;
		System.out.println(negativo);
		int positivo = +negativo;
		System.out.println(positivo);
	}

	public static int maiorNumeroModoUm(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	public static int maiorNumeroModoDois(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

}

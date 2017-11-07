import java.util.Arrays;
import java.util.Scanner;

public class Cadastro1 {
	
	private Scanner scanner = new Scanner(System.in);
	private final int MAX_PESSOAS = 10;
	private final String prompt = "Digite o nome de uma pessoa: ";
	private String[] cadastro;
	private int numPessoas = 0;

	public Cadastro1() {
		cadastro = new String[MAX_PESSOAS];
	}

	public void cadastraPessoas() {
		System.out.println(prompt);
		String nome = scanner.next();
		while (!nome.equals("-1")) {
			cadastro[numPessoas++] = nome;
			System.out.println(prompt);
			nome = scanner.next();
		}
	}

	public void cadastraPessoa() {
		System.out.println(prompt);
		String nome = scanner.next();
		if (!nome.equals("-1") && numPessoas < MAX_PESSOAS) {
			cadastro[numPessoas++] = nome;
		}
	}

	public void imprimeCadastro() {
		System.out.println();
		for (int i = 0; i < numPessoas; i++) {
			System.out.println(cadastro[i]);
		}
	}

	public void ordenaCadastro() {
		String[] tmp = new String[numPessoas];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = cadastro[i];
		}
		Arrays.sort(tmp);
		for (int i = 0; i < tmp.length; i++) {
			cadastro[i] = tmp[i];
		}
	}

	public static void main(String[] args) {
		Cadastro1 cadastro = new Cadastro1();
		// entrada dos dados de cadastro
		cadastro.cadastraPessoas();
		// imprime o cadastro antes da ordenação
		cadastro.imprimeCadastro();
		// ordena o cadastro
		cadastro.ordenaCadastro();
		// imprime o cadastro antes da ordenação
		cadastro.imprimeCadastro();
	} // main
} // Cadastro1
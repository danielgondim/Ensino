import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Cadastro3 {
	private Scanner scanner = new Scanner(System.in);
	private final String prompt = "Digite o nome de uma pessoa: ";
	private List<String> cadastro;
	
	public Cadastro3() {
		cadastro = new ArrayList<String>();
	}

	public void cadastraPessoas() {
		System.out.println(prompt);
		String nome = scanner.next();
		while (!nome.equals("-1")) {
			cadastro.add(nome);
		}
	}

	public void cadastraPessoa() {
		System.out.println(prompt);
		String nome = scanner.next();
		if (!nome.equals("-1")) {
			cadastro.add(nome);
		}
	}

	public void imprimeCadastro() {
		System.out.println();
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
	}

	public void ordenaCadastro() {
		Collections.sort(cadastro);
	}

	public static void main(String[] args) {
		Cadastro3 cadastro = new Cadastro3();
		// entrada dos dados de cadastro
		cadastro.cadastraPessoas();
		// imprime o cadastro antes da ordenação
		cadastro.imprimeCadastro();
		// ordena o cadastro
		cadastro.ordenaCadastro();
		// imprime o cadastro antes da ordenação
		cadastro.imprimeCadastro();
	} // main
} // Cadastro3
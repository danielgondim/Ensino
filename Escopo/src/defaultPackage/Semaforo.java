package defaultPackage;
public class Semaforo {

	private static final String VERMELHO = "VERMELHO";
	private static final String AMARELO = "AMARELO";
	private static final String VERDE = "VERDE";
	private String corAtual;

	public Semaforo() {
		corAtual = VERMELHO;
	}

	public void muda() {
		if (corAtual.equals(VERMELHO)) {
			corAtual = VERDE;
		} else if (corAtual.equals(AMARELO)) {
			corAtual = VERMELHO;
		} else {
			corAtual = AMARELO;
		}
	}

	public String getCorAtual() {
		return corAtual;
	}

	public String toString() {
		return "semaforo esta' " + getCorAtual();
	}
}

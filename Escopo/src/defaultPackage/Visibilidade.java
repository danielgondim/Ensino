package defaultPackage;

public class Visibilidade {
	
	TestandoEscopo objeto = new TestandoEscopo();
	
	public void acessandoAtributos() {
		int x = objeto.variavelDoObjeto;
	}

}

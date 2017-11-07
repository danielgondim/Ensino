package defaultPackage;
public class TestandoEscopo {

	public int variavelDoObjeto = 1;
	
	public void umMetodo(int parametroUm, String parametroDois) {
		
		int variavelLocalDoMetodo = 2;
		
		try {
			if (variavelLocalDoMetodo > 10) {
				
			}
		} catch (Exception e) {
			String variavelDoEscopoDaExcecao = "...";
		}
	}
	
	public int outroMetodo(int parametro) {
		
		if (parametro > 10) {
			String mensagem = "Entrei no if";
			System.out.println(mensagem);
		}
		
		System.out.println(mensagem);
		
		return variavelDoObjeto;
	}
}

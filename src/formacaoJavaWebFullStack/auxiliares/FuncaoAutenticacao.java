package formacaoJavaWebFullStack.auxiliares;

import formacaoJavaWebFullStack.interfaces.PermitirAcesso;

//Somente objetos que tenham o contrato de interface de permitirAcesso e chamar o autenticacao
public class FuncaoAutenticacao {
	
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		
		return acesso.autenticar();

	}
}

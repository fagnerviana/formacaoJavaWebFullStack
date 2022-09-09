package formacaoJavaWebFullStack.executavel;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.auxiliares.FuncaoAutenticacao;
import formacaoJavaWebFullStack.classes.Secretario;
import formacaoJavaWebFullStack.interfaces.PermitirAcesso;

public class InterfacePolimorfismo {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Digitar o Login");
		String senha = JOptionPane.showInputDialog("Digitar a senha de acesso ");
		 
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
					
		if(new FuncaoAutenticacao().autenticarCursoJava(permitirAcesso)) {	
			JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Sistema");
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
			
		}
		

	}

}

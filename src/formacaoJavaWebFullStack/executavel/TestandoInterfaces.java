package formacaoJavaWebFullStack.executavel;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.classes.Secretario;

public class TestandoInterfaces {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Digitar o Login");
		String senha = JOptionPane.showInputDialog("Digitar a senha de acesso ");
		
		//Da linha 16 a linha 20 sistema funcionando essa é uma forma de utilizar a interfaces		
		/*
		Secretario secretario = new Secretario();//Diretamente com o objetoes
		secretario.setLogin(login);
		secretario.setSenha(senha);
		*/		
		//if(secretario.autenticar()) {
		
		if(new Secretario().autenticar(login,senha)) {	
			JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Sistema");
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
			
		}
		

	}

}

package formacaoJavaWebFullStack.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.auxiliares.FuncaoAutenticacao;
import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Secretario;
import formacaoJavaWebFullStack.interfaces.PermitirAcesso;

public class TratandoErros {

	public static void main(String[] args) {
		//Utilizando o Try/Catch
		try {

			String login = JOptionPane.showInputDialog("Digitar o Login");
			String senha = JOptionPane.showInputDialog("Digitar a senha de acesso ");

			PermitirAcesso permitirAcesso = new Secretario(login, senha);

			Aluno aluno = null;
			lerArquivo();

			try {
				// Gerando erros para testar
				File file = new File("c://lines.txt");
				Scanner scanner = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				//chamando a classe customizadas do erro 
				throw new ExcecoesCustomizadas("Vixe aconteceu um erro ao tentar encontrar as notas do aluno");
			}

			if (new FuncaoAutenticacao().autenticarCursoJava(permitirAcesso)) {
				JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Sistema");

				aluno.setNome("Fagner");
				aluno.setIdade(35);

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");

			}

//Aqui o sistema informa o motico do Erro 
		} catch (Exception e) {
			// imprimi o erro no console do Java
			e.printStackTrace();

			System.out.println(" Mensagem de erro: " + e.getMessage());
		}

	}
	
	public static void lerArquivo() throws ExcecoesCustomizadas {
		try {
			// Gerando erros para testar
			File file = new File("c://lines.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//chamando a classe customizadas do erro 
			throw new ExcecoesCustomizadas("Vixe aconteceu um erro ao tentar encontrar as notas do aluno");
		}
	}
}



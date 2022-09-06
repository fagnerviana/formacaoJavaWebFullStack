package formacaoJavaWebFullStack.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Diretor;
import formacaoJavaWebFullStack.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Favor informar seu login");
		String senha = JOptionPane.showInputDialog("Favor digitar senha ?");

		if (login.equals("admin") && senha.equals("admin")) {
			System.out.println("Seja bem vindo , " + login + " !");
			Scanner sc = new Scanner(System.in);

			List<Aluno> alunoLista = new ArrayList<Aluno>();
			List<Diretor> diretorLista = new ArrayList<Diretor>();
			List<Secretario> secretarioLista = new ArrayList<Secretario>();

			int op;

			do {
				System.out.println("Escolha conforme o codigo ao lado !");
				System.out.println("-1- Cadastrar Aluno");
				System.out.println("-2- Cadastrar Diretor");
				System.out.println("-3- Cadastrar Secretario");
				System.out.println("-4- Mostrar todos Registrados");
				System.out.println("-0- Sair" + "");

				op = sc.nextInt();
				switch (op) {

				case 1:
					System.out.println("-1- Cadastrar Aluno\n");
					String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
					String nomeEscola = JOptionPane.showInputDialog("Favor digite o nome da Escola");
					String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: " + nomeAluno);
					Aluno aluno = new Aluno();
					aluno.setNome(nomeAluno);
					aluno.setNomeEscola(nomeEscola);
					aluno.setNomeMae(nomeMae);
					alunoLista.add(aluno);
					break;

				case 2:
					System.out.println("-2- Cadastrar Diretor");
					String nomeDiretor = JOptionPane.showInputDialog("Digite o nome do Diretor");
					String nomeRegistroEducacao = JOptionPane
							.showInputDialog("Favor digitar o numero do registro Educação");
					Integer tempoDirecao = Integer
							.parseInt(JOptionPane.showInputDialog("Qual o tempo no cargo de Diretor: " + nomeDiretor));
					Diretor diretor = new Diretor();
					diretor.setNome(nomeDiretor);
					diretor.setRegistroEducacao(nomeRegistroEducacao);
					diretor.setTempoDirecao(tempoDirecao);
					diretorLista.add(diretor);
					break;

				case 3:
					System.out.println("-3- Cadastrar Secretario");
					String nomeSecretario = JOptionPane.showInputDialog("Digite o nome do Secretario");
					String registro = JOptionPane.showInputDialog("Registro do secretario: " + nomeSecretario);
					String nivelCargo = JOptionPane.showInputDialog("Qualo cargo ?" + nomeSecretario);
					String numeroCpf = JOptionPane.showInputDialog("Informar o CPF: " + nomeSecretario);
					Secretario secretario = new Secretario();
					secretario.setNome(nomeSecretario);
					secretario.setRegistro(registro);
					secretario.setNivelCargo(nivelCargo);
					secretario.setNumeroCpf(numeroCpf);

					secretarioLista.add(secretario);

					break;
				case 4:	System.out.println("Todos Registrados");
				System.out.println(alunoLista);
				System.out.println(diretorLista);
				System.out.println(secretarioLista);
				
					break;
				case 5:
					System.out.println("Escolha conforme o codigo ao lado !");
					break;

				}

			} while (op != 0);

		}

		System.out.println("Obrigado por Utilizar nosso sistema !");
		System.out.println("Fagner Viana");
	}
}

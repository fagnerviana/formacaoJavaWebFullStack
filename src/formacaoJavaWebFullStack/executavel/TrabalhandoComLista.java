package formacaoJavaWebFullStack.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Disciplina;

public class TrabalhandoComLista {

	public static void main(String[] args) {
		// Aqui é uma Lista
		List<Aluno> alunoLista = new ArrayList<Aluno>();
		List<Disciplina> disciplinaLista = new ArrayList<>();

		// Aqui é uma instancia da classe
		// Aluno alunoCadastrar = new Aluno();
		// Disciplina disciplina = new Disciplina();

		Scanner sc = new Scanner(System.in);
		int op;

		do {
			System.out.println("Favor escolher a opção ");
			System.out.println(" 1 - Cadastrar novo Aluno"); // Funcionando
			System.out.println(" 2 - Cadastrar novo Curso"); // Funcionando
			System.out.println(" 3 - Pesquisar Aluno"); // Funcionando
			System.out.println(" 4 - Excluir Disciplina");// Funcionando
			System.out.println(" 5 - Listar Aluno");// Funcionando
			System.out.println(" 6 - Listar Disciplina");// Funcionando
			System.out.println(" 7 - Adicionar as Disciplinas para o Aluno");
			System.out.println(" 0 - Sair do Sistema ");// Funcionando

			op = sc.nextInt();

			switch (op) {

			case 1:
				String nomeAluno = JOptionPane.showInputDialog("Favor digitar o nome do Aluno: ");
				String nomeEscola = JOptionPane.showInputDialog("Favor digitar o nome da Escola: ");
				// instanciando a classe
				Aluno alunoCadastrar = new Aluno();
				alunoCadastrar.setNome(nomeAluno);
				alunoCadastrar.setNomeEscola(nomeEscola);

				// jogando o objeto na lista de Aluno
				alunoLista.add(alunoCadastrar);

				System.out.println(alunoCadastrar);
				break;

			case 2:
				String nomeDisciplina = JOptionPane.showInputDialog("Favor Digite o nome Disciplina");
				// double notaDisciplina =
				// Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da
				// Disciplina"+nomeDisciplina));
				Disciplina disciplina = new Disciplina();
				disciplina.setNome(nomeDisciplina);
				disciplinaLista.add(disciplina);

				// System.out.println(disciplinaLista);

				break;

			case 3:
				String pesquisarAluno = JOptionPane.showInputDialog("Favor Digite o nome Aluno");
				for (Aluno aluno : alunoLista) {

					if (aluno.getNome().equalsIgnoreCase(pesquisarAluno)) {
						System.out.println("Aluno encontrado: " + aluno.getNome());
						System.out.println(aluno.getDisciplinas());
					}
				}
				break;

			case 4:
				System.out.println("Favor escolher a disciplina para exclusão conforme posição: ");
				for (int i = 0; i < disciplinaLista.size(); i++) {
					System.out.println("Posição: " + i + " Disciplina Nome: " + disciplinaLista.get(i));
					// para exclusão conforme escolhido pelo ususario
				}
				Integer remove = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Posição "));
				for (int j = 0; j < disciplinaLista.size(); j++) {
					if (remove == j) {
						disciplinaLista.remove(j);
						System.out.println("Removido com sucesso");
					}

				}

				break;
			case 5:
				for (int i = 0; i < alunoLista.size(); i++) {

					System.out.println("Codigo: " + i + " Nome do Aluno:  " + alunoLista.get(i));

				}
				break;

			case 6:
				for (int i = 0; i < disciplinaLista.size(); i++) {

					System.out.println("Disciplina Nome: " + disciplinaLista.get(i));

				}
				break;

			case 7:
				System.out.println("Favor informa o nome do Aluno, para adicionar a Disciplina e a nota");
				String buscarAluno = JOptionPane.showInputDialog("Favor Digite o nome Aluno");
				
				for (Aluno aluno : alunoLista) {
				 if (aluno.getNome().equalsIgnoreCase(buscarAluno)) {
				   System.out.println("Aluno encontrado: " + aluno.getNome());
				   System.out.println("Favor escolher a disciplina para adicionar na lista do aluno: ");
					
				   for (int i = 0; i < disciplinaLista.size(); i++) {
						System.out.println("Posição: " + i + " Disciplina Nome: " + disciplinaLista.get(i));
						// para exclusão conforme escolhido pelo ususario
					}
					Integer adicionar = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Posição da Disciplina "));
					for (int j = 0; j < disciplinaLista.size(); j++) {
						if (adicionar == j) {
						double addNota= Double.parseDouble(JOptionPane.showInputDialog("Favor informa a pontuação do Aluno: "+aluno.getNome()+"Na Disciplina: "+disciplinaLista.get(j)));
						Disciplina disc = new Disciplina();	
						disc.setNome(disciplinaLista.get(j).getNome());
						disc.setNota(addNota);
						aluno.getDisciplinas().add(disc);
						
						}
					}
				   
				 }
				}
			}
        // Opção seja diferente ZERO , ele sai do lupe.
		} while (op != 0);
           // Saida do sistema 
		System.out.println("Obrigado por utilizar o nosso sistema");
		System.out.println("By Fagner Viana");

	}
}

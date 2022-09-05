package formacaoJavaWebFullStack.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Disciplina;

public class TrabalhandoComLista {

	public static void main(String[] args) {
		//Aqui é uma lista de Aluno
		List<Aluno> alunoLista = new ArrayList<Aluno>();
		List<Disciplina> disciplinaLista = new ArrayList<>();
		
		//Aqui é uma instancia da classe
		Aluno alunoCadastrar = new Aluno();
		Disciplina disciplina = new Disciplina();

		Scanner sc = new Scanner(System.in);
		int contadorALuno =0;

		int op;
		
		do {
		System.out.println("Favor escolher a opção ");
		System.out.println(" 1 - Cadastrar novo Aluno");
		System.out.println(" 2 - Cadastrar novo Curso");
		System.out.println(" 3 - Pesquisar Aluno");
		System.out.println(" 4 - Excluir Disciplina");
		System.out.println(" 5 - Listar Aluno");
		System.out.println(" 6 - Listar Disciplina");
		System.out.println(" 0 - Sair do Sistema ");
				
		op=sc.nextInt();
		
		switch(op) {
		
		case 1: String nomeAluno = JOptionPane.showInputDialog("Favor digitar o nome do Aluno: ");
		        String nomeEscola = JOptionPane.showInputDialog("Favor digitar o nome da Escola: ");
		        //instanciando a classe 
		        alunoCadastrar.setNome(nomeAluno);
		        alunoCadastrar.setNomeEscola(nomeEscola);
		        
		        //jogando o objeto na lista de Aluno
		        alunoLista.add(alunoCadastrar);
		        
		        System.out.println(alunoCadastrar);
			    break;
			    
		case 2: String nomeDisciplina = JOptionPane.showInputDialog("Favor Digite o nome Disciplina");
		        //double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da Disciplina"+nomeDisciplina));
                disciplina.setNome(nomeDisciplina);
                disciplinaLista.add(disciplina);
                
                System.out.println(disciplinaLista);
		
		       break;
		
		
		case 3: String pesquisarAluno =JOptionPane.showInputDialog("Favor Digite o nome Aluno");
		        for (Aluno aluno : alunoLista){
					
		        	if(aluno.getNome().equalsIgnoreCase(pesquisarAluno)) {
		        		System.out.println("Aluno encontrado: "+alunoLista);
		        	}
		        	
				}
		
		break;
		
		
		case 4: System.out.println("Excluir Disciplina \n");break;
		case 5: System.out.println("Listar Aluno \n");break;
		case 6: System.out.println("Listar Disciplina \n");break;
		}
		
			
		
		} while(op!=0);
		
			System.out.println("Obrigado por utilizar o nosso sistema");
			System.out.println("By Fagner Viana");
		
		/*
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i =1;i<=2;i++) {
			String nomeAluno = JOptionPane.showInputDialog("Favor digitar o nome do Aluno: "+i);
			String nomeEscola = JOptionPane.showInputDialog("Favor digitar o nome da Escola: "+i);
			Aluno aluno = new Aluno();
			
			aluno.setNome(nomeAluno);
			aluno.setNomeEscola(nomeEscola);
			
			alunos.add(aluno);
			
			for(int j=0;j<4;j++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Favor Difite o nome Disciplina");
				double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da Disciplina"+nomeDisciplina));
								
				Disciplina disciplina = new Disciplina();
				disciplina.setNome(nomeDisciplina);
				disciplina.setNota(notaDisciplina);
				
				aluno.getDisciplinas().add(disciplina);
			}
			
			
		}
		
		for (int k =0;k<2;k++) {
			System.out.println(alunos.get(k)+"Resultado Final: "+alunos.get(k).Resultado());
			
		}
				
		
		System.out.println("A média do aluno: "+fagner.CalcularMedia());
		System.out.println("O nome do aluno: "+fagner.getNome()+"\n");
		System.out.println("Disciplina: "+fagner.getDisciplinas());
		
		System.out.println("Resultado Final: "+fagner.Resultado());
		
		System.out.println("*********Exclusão de Disciplina***********");
		 int op=JOptionPane.showConfirmDialog(null, "Gostaria de Exclcui alguma Disciplina ?");
		
		 while(op==0) {
		
			 if(op==0) {
				 System.out.println("Escolha o numero conforme a disciplina descrita");
				 
				 for (int i=0; i<alunos.size();i++) {
					 
					System.out.println("Numero: "+ i + alunos.get(i));
		       }
		 			
		   }			 
			 int remove = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero conforme a Disciplina para remover"));
			 ((Aluno) alunos).getDisciplinas().remove(remove);
			 
			 op=JOptionPane.showConfirmDialog(null, "Deseja excluir alguma outra Disciplina ?");
		  }
		
		 System.out.println("Apos exclusão da Disciplina");
		 for (int i=0; i<((Aluno) alunos).getDisciplinas().size();i++) {
			 
				System.out.println("Numero: "+i+ ((Aluno) alunos).getDisciplinas().get(i));
				
		} */

	}
}

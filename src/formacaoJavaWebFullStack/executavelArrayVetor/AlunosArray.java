package formacaoJavaWebFullStack.executavelArrayVetor;

import java.util.ArrayList;
import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Disciplina;

//Classe criada para realizar os testes utilizando orientações objeto.
public class AlunosArray {

	public static void main(String[] args) {
		
		/*Cada Disciplina tera 4 notas */
		//List<Aluno>alunoLista= new ArrayList<Aluno>();
		
		//Instanciando o Aluno
		Aluno aluno= new Aluno();
		aluno.setNome("Fagner");
		aluno.setIdade(35);
		
		Aluno aluno1 = new Aluno();	
		aluno1.setNome("Roberto");
		aluno1.setIdade(40);
		
		// ciando o array de notas
		double[] notas = new double[4];
		notas[0] = 90.8;
		notas[1] = 90.5;
		notas[2] = 90.5;
		notas[3] = 45.5;
		
		double[] notas2 = new double[4];
		notas2[0]=70.8;
		notas2[1]=90.5;
		notas2[2]=75.5;
		notas2[3]=67.5;
		
		double[] notasAluno1 = new double[4];
		notasAluno1[0] = 20.8;
		notasAluno1[1] = 20.5;
		notasAluno1[2] = 20.5;
		notasAluno1[3] = 45.5;
	
		double[] notas2Aluno1 = new double[4];
		notas2Aluno1[0] = 20.8;
		notas2Aluno1[1] = 20.5;
		notas2Aluno1[2] = 20.5;
		notas2Aluno1[3] = 45.5;
	
		
		// Instanciando a disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Java");
		disciplina.setNota(notas);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Fisica");
		disciplina3.setNota(notasAluno1);
				
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("UML");
		disciplina4.setNota(notas2Aluno1);
				
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Matematica");
		disciplina2.setNota(notas2);
		
		
		//atribuindo a disciplina na classe Aluno
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		aluno1.getDisciplinas().add(disciplina2);
		
		//Criando Arry de Aluno .
		
		Aluno[] arrayAluno = new Aluno[2];
		arrayAluno[0]=aluno;
		arrayAluno[1]=aluno1;
				
		//Realizando impressões no console.
		System.out.println(arrayAluno[0]);
		System.out.println(arrayAluno[1]);
		//System.out.println(aluno1.get(0).getDisciplinas().toString());
				
		//System.out.println(aluno1.get(0).CalcularMedia());
		
		for (int i=0;i<arrayAluno.length;i++) {
			System.out.println("\nNome do Aluno: " 
		            + arrayAluno[i].getNome());
		    for(int j=0;j<2;j++) {
		          	System.out.println("\nNome do disciplina: "+ arrayAluno[i].getDisciplinas().get(j).getNome()
		          			+"\nResultado Final: "
		           			+ arrayAluno[i].getDisciplinas().get(j).calcularNotasDisciplina()
		          			+"\nResultado Final: "+arrayAluno[i].getDisciplinas().get(j).ResultadoFinal());
		            
		          }
		}
	}
}

package formacaoJavaWebFullStack.executavel;

import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Disciplina;

public class TrabalhandoComLista {

	public static void main(String[] args) {
		
		//Instaciar as disciplinas
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matematica");
		disciplina1.setNota(75.5);
		
        Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Portugues");
		disciplina2.setNota(60.6);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Fisica");
		disciplina3.setNota(70.4);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("Inglês");
		disciplina4.setNota(85.4);
		
		
		Aluno fagner = new Aluno();
		
		fagner.setNome("Fagner");
		fagner.getDisciplinas().add(disciplina1);
		fagner.getDisciplinas().add(disciplina2);
		fagner.getDisciplinas().add(disciplina3);
		fagner.getDisciplinas().add(disciplina4);
		
		
		System.out.println(fagner.CalcularMedia());
		
		
		
		

	}

}

package formacaoJavaWebFullStack.classes;

import java.util.Arrays;
import java.util.Objects;

import formacaoJavaWebFullStack.constantes.StatusAluno;

public class Disciplina {

	private String nome;
	private double[] nota = new double[3];

	
	//Calcula a média das notas por disciplinas
	public double calcularNotasDisciplina() {
		
		double somaTotal=0;
		
		/*for(Disciplina disciplina : disciplina) {
			somaTotal+=disciplina.calcularNotasDisciplina();
		}*/
		
		
		for(int i=0; i<nota.length;i++) {
			somaTotal+=nota[i];
		}
		
		return somaTotal/4; 
	}
	
	public String ResultadoFinal() {
		
		if (calcularNotasDisciplina() >= 50.00) {
			return "APROVADO";
		} else {
			return "REPROVADO";
		}
	}
	
	public Disciplina() {
		
	}

	
	public Disciplina(String nome, double[] nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(nome);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nome, other.nome) && Arrays.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", nota=" + Arrays.toString(nota) + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	
	
}

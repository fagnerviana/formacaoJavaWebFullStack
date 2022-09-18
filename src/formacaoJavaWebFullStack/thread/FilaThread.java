package formacaoJavaWebFullStack.thread;

import java.util.Objects;

public class FilaThread {
	
	public String nome;
	public String email;
	
	
	public FilaThread() {
		
	}
	
	public FilaThread(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilaThread other = (FilaThread) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	

}

package formacaoJavaWebFullStack.classes;

import formacaoJavaWebFullStack.interfaces.PermitirAcesso;

/*Implementar a interface PermitirAcesso
 * Necessario adicionar novos atributos - login e senha
 * 
 * */


public class Secretario extends Pessoa implements PermitirAcesso{

	private String Registro; 
	private String NivelCargo;
	private String Experiencia;
	private String login;
	private String senha;
	
	//Metodos
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 2200.50;
	}
	
	//Metodo da INTERFACE permitir acesso
	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin");
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equalsIgnoreCase("admin")&& senha.equalsIgnoreCase("admin");
	}
	
	//Construtores
	public Secretario() {
		
	}
	
	public Secretario(String login,String senha) {
		this.login=login;
		this.senha=senha;
	}
	public Secretario(String registro, String nivelCargo, String experiencia) {
		super();
		Registro = registro;
		NivelCargo = nivelCargo;
		Experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [Registro=" + Registro + ", NivelCargo=" + NivelCargo + ", Experiencia=" + Experiencia + "]";
	}
	public String getRegistro() {
		return Registro;
	}
	public void setRegistro(String registro) {
		Registro = registro;
	}
	public String getNivelCargo() {
		return NivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		NivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	
}

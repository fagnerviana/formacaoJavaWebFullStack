package formacaoJavaWebFullStack.classes;

public class Secretario extends Pessoa{

	private String Registro; 
	private String NivelCargo;
	private String Experiencia;
	
	public Secretario() {
		
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
	
	
	
	
}

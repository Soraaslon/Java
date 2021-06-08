
public class Motor {
	//Variáveis
	private String tipo;
	private Double tamanho;
	
	//Construtores
	public Motor() {
		this.tipo = "";
		this.tamanho = 0.0;
	}
	
	public Motor(String tipo, Double tamanho) {
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
	
	//Métodos Getters
	public String getTipo() {
		return tipo;
	}
	public Double getTamanho() {
		return tamanho;
	}
	
	//Métodos Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
}

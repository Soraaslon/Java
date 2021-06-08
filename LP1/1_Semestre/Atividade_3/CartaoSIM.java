
public class CartaoSIM {
	//Variáveis
	private String operadora, tamanho;
	private Integer numero;
	
	//Construtores
	public CartaoSIM() {
		this.operadora = "";
		this.tamanho = "";
		this.numero = 0;
	}
	public CartaoSIM(String operadora, String tamanho, Integer numero) {
		this.operadora = operadora;
		this.tamanho = tamanho;
		this.numero = numero;
	}
	
	//Métodos Getters
	public String getOperadora() {
		return operadora;
	}
	public String getTamanho() {
		return tamanho;
	}
	public Integer getNumero() {
		return numero;
	}
	
	//Métodos Setters
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}

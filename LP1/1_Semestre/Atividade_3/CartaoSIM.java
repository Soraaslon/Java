
public class CartaoSIM {
	//Vari�veis
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
	
	//M�todos Getters
	public String getOperadora() {
		return operadora;
	}
	public String getTamanho() {
		return tamanho;
	}
	public Integer getNumero() {
		return numero;
	}
	
	//M�todos Setters
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


public class Mobile {
	//Vari�veis
	private String modelo, marca;
	private CartaoSIM cartao;
	
	//Construtores
	public Mobile() {
		this.modelo = "";
		this.marca = "";
		this.cartao = new CartaoSIM();
	}
	public Mobile(String modelo, String marca, CartaoSIM cartao) {
		this.modelo = modelo;
		this.marca = marca;
		this.cartao = cartao;
	}
	
	//M�todos Getters
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public CartaoSIM getCartao() {
		return cartao;
	}
	
	//M�todos Setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setCartao(CartaoSIM cartao) {
		this.cartao = cartao;
	}
}

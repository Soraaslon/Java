
public class Carro {
	//Variáveis
	private String marca, modelo;
	private Motor motor;
	
	//Construtores
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.motor = new Motor();
	}
	
	public Carro(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	//Métodos Getters
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	
	//Métodos Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}

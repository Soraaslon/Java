import java.time.LocalDate;

public class Gato extends Mamifero implements Animal{
	private String pelagem;

	//Construtores
	public Gato() {
		super();
		this.pelagem = "";
	}
	public Gato(String nome, LocalDate nascimento, String pelagem) {
		super(nome, nascimento);
		this.pelagem = pelagem;
	}

	//Getters e Setters
	public String getCor() {
		return pelagem;
	}
	public void setCor(String pelagem) {
		this.pelagem = pelagem;
	}
	
	//Sobrescrita
	@Override
	public String toString() {
		return super.toString()+"Gato [pelagem=" + pelagem + "]";
	}
	@Override
	public String especie() {
		return "Ragdoll";
	}
	@Override
	public String somAnimal() {
		return "Miauuu";
	}
	@Override
	public Integer idade() {
		Integer idade = LocalDate.now().compareTo(getNascimento());
		return idade;
	}
	
	
	
}

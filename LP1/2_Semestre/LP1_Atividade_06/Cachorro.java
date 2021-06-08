import java.time.LocalDate;

public class Cachorro extends Mamifero implements Animal{
	private String cor;

	//Construtores
	public Cachorro() {
		super();
		this.cor = "";
	}
	public Cachorro(String nome, LocalDate nascimento, String cor) {
		super(nome, nascimento);
		this.cor = cor;
	}

	//Getters e Setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Sobrescrita
	@Override
	public String toString() {
		return super.toString()+"Cachorro [cor=" + cor + "]";
	}
	@Override
	public String especie() {
		return "Husky siberiano";
	}
	@Override
	public String somAnimal() {
		return "Auau";
	}
	@Override
	public Integer idade() {
		Integer idade = LocalDate.now().compareTo(getNascimento());
		return idade;
	}
	
	
}

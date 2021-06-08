import java.time.LocalDate;

public class Mamifero {
	private String nome;
	private LocalDate nascimento;
	
	//Construtores
	public Mamifero() {
		this.nome = "";
		this.nascimento = LocalDate.now();
	}
	public Mamifero(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public String toString() {
		return "Mamifero [nome=" +nome+ ", nascimento=" +nascimento+ "]";
	}
	
}

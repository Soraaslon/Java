
public class Tempo {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	
	// Construtores
	
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tempo(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	// M�todos
	
	public void imprimir() {
		System.out.println(horas+":"+minutos+":"+segundos);
	}
	
	public Integer horasemsegundos() {
		if(horas>0) {
			return horas*3600;
		}
		else {
			return 0;
		}
	}
	
	public Integer minutosemsegundos() {
		if(minutos>0) {
			return minutos*60;
		}
		else {
			return 0;
		}
	}
	
	// Getters e Setters

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	
}

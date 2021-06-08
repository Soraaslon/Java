
public class Calculadora {
	private static String resultado;
	
	public static Integer multiplicar (Integer valor1, Integer valor2) {
		return valor1*valor2;
	}
	
	public static Double multiplicar (Double valor1, Double valor2) {
		return valor1*valor2;
	}
	
	public static Integer cubo (Integer valor){
		return valor*valor*valor;
	}
	
	public static String parimpar (Integer valor) {
		if(valor==0) {
			resultado = "Zero";
		}
		else {
		if(valor%2==0) {
			resultado = "Par";
		}
		else
			resultado = "Impar";
		}
		return resultado;
	}
	
}

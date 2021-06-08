import java.util.Scanner;
public class exer_02_aula_05 {

	public static void main(String[]args) {
		
		char vic[] = new char[10];
		Integer g,t=0;
		Scanner gg = new Scanner(System.in);
		Integer h = vic.length;
		
		for(g=0;g<h;g++) {
			System.out.println("Digite um caracter: ");
			vic[g]= gg.next().charAt(0);
		}
		for(g=0;g<h;g++) {
			if (vic[g]==('a')) {
			}
			else if (vic[g]==('e')) {
			}
			else if (vic[g]==('i')) {
			}
			else if (vic[g]==('o')) {
			}
			else if (vic[g]==('u')) {
			}
			else
				t=t+1;
			}
		System.out.println("O numero de consoantes é :"+t);
		
		
	}
	
	
}

import java.util.Scanner;
public class exer_02_aula_05 {

	public static void main(String[]args) {
		
		String vic[] = new String[10];
		Integer g,t=0;
		Scanner gg = new Scanner(System.in);
		Integer h = vic.length;
		
		for(g=0;g<h;g++) {
			System.out.println("Digite um caracter: ");
			vic[g]= gg.nextLine();
		}
		for(g=0;g<h;g++) {
			if (vic[g].equals("a")||vic[g].equals("e")||vic[g].equals("i")||vic[g].equals("o")||vic[g].equals("u")) {
			}
			else
				t = t+1;}
		System.out.println("O numero de consoantes é :"+t);
		
		
	}
	
	
}

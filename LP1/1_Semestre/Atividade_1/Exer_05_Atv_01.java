import java.util.Scanner;
public class Exer_05_Atv_01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Integer idade;
		
		System.out.println("Digite a sua idade:");
		idade = sc.nextInt();
		
		while(idade<0) {
			System.out.println("Essa idade n�o � v�lida\nDigite a sua idade de verdade:");
			idade = sc.nextInt();}
		
		if(idade>=16) 
			System.out.println("Voc� pode votar");
		else
			System.out.println("Voc� n�o pode votar");
}}

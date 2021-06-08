import java.util.Scanner;

public class Exer_05_lista_02 {
	public static void main(String[]args) {
		Integer cont, soma=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite números positivos para somá-los, ou um negativo quando quiser encerrar: ");
		cont=sc.nextInt();
		
		while(cont>=0) {
			soma=soma+cont;
			System.out.println("Esse é o resultado da soma: "+soma);
			System.out.println("Digite um número novamente");
			cont=sc.nextInt();
		}
		System.out.println("\n Bye Bye :3");
}}

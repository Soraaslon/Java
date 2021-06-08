import java.util.Scanner;

public class Exer_04_Lista_02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Integer cont=0;
		System.out.println("Digite um número de 1 a 100:\n -= Quando quiser sair digite 0 =-");
		cont= sc.nextInt();
		while(cont != 0){
			if(cont>0 && cont<=100) {
			while(cont>0) {
				System.out.println("*");
				cont--;
			}}
			else {
				System.out.println("Aqui cê não burla !!!\nTa achando que sou ótario??? Ou me obedece ou fica aqui pra sempre\n");
			}
		System.out.println("Digite um número de 1 a 100: ");
		cont= sc.nextInt();
		}
		System.out.println("\nBye =)");
}}

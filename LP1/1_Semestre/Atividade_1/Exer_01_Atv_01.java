import java.util.Scanner;

public class Exer_01_Atv_01 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Integer verifica, senha=1234;
		System.out.println("Digite a senha:");
		verifica=sc.nextInt();
		
		if(verifica.equals(senha)) {
			System.out.println("ACESSO PERMITIDO");}
		else
			System.out.println("ACESSO NEGADO");
}}

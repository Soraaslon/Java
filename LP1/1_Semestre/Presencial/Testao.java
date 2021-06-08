package luta;
import java.util.Scanner;

public class Testao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Criaremos um objeto aluno\nInsira um nome: ");
		String nm1 = sc.next();
		System.out.print("Insira a idade: ");
		int id1 = sc.nextInt();
		Teste jzin = new Teste(id1, nm1);
		String stg = jzin.toString();
		System.out.println("A representação, em String, do objeto aluno criado é: " + stg);
		System.out.println(id1 + nm1);
	}

}
package atividade_01;
import java.util.Scanner;
import java.util.ArrayList;

public class Exer_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		String nome;
		Integer idade;
		Integer numero;
		
		
		System.out.println("Preencha os dados dos jogadores, para finalizar digite '0'");
		do {
			
			System.out.println("\n-= Novo Jogador =-");
			
			System.out.print("Nome: ");
			nome=sc.nextLine();
			if(nome.equals("0")) {
				break;
			}
			
			System.out.print("Idade: ");
			do {
				idade=sc.nextInt();
				if(idade<0) {
					System.out.println("Digite um valor positivo");
				}
			}while(idade<0);
			if(idade==0) {
				break;}
			
			System.out.print("Número: ");
			do {
				numero=sc.nextInt();
				if(numero<0) {
					System.out.println("Digite um valor positivo");
				}
			}while(numero<0);
			if(numero==0) {
				break;}
			
			sc.nextLine();
			Jogador jogador = new Jogador(nome, idade, numero);
			jogadores.add(jogador);
			
		}while(true);

		
		System.out.println("\n - Esses foram os jogadores registrados por você:");
		for(Jogador j: jogadores) {
			System.out.println("\n"+j);
		}
		sc.close();
	}
}

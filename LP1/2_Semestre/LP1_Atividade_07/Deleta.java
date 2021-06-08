package atividade_07;

import java.util.Scanner;
import java.util.ArrayList;

public class Deleta {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		Scanner scan = new Scanner (System.in);
		String verifica = new String();
		boolean entre = true;
		
		nomes.add("José");
		nomes.add("Igor");
		nomes.add("Vic");
		nomes.add("Tonho");
		nomes.add("Lol");
		
		System.out.println("Lista de nomes:");
		for (String x: nomes)
			System.out.println(x);
		
		while(entre) {
			System.out.println("\nDigite o nome que deseja apagar, ou digite N para sair");
			verifica = scan.nextLine();
			
			if(verifica.equals("N")||verifica.equals("n")) {
				System.exit(0);
			}
			for(int x=0; x<nomes.size(); x++) {
				if(nomes.get(x).equals(verifica)) {
					nomes.remove(nomes.get(x));
					entre = false;
				}
			}
			if(entre) {
			System.out.println("Valor inválido");}
		}
		
		System.out.println("\nLista de nomes:");
		for (String x: nomes)
			System.out.println(x);
		
		
		scan.close();
	}
}
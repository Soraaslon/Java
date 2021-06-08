package atividade_07;

import java.util.Random;
import java.util.ArrayList;

public class Maior_Aleatorio {

	public static void main(String[] args) {

		ArrayList<Integer> valores = new ArrayList<>();
		valores = gerarVetor(10);
		Integer maior = 0;
		
		for(int x=0; x<valores.size();x++) {
			if(valores.get(x)>(maior)){
				maior = valores.get(x);
		}}
		
		System.out.println("O maior valor é:"+maior);
	}
	
	public static ArrayList<Integer> gerarVetor(int n) {
		ArrayList<Integer> valores = new ArrayList<>();
		Random gerador = new Random();
		
		for(int i=0; i<n; i++) {
			valores.add(gerador.nextInt(101));
		}
		return valores;
	}
}
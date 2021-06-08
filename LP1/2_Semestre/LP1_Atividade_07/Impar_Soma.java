package atividade_07;

import java.util.ArrayList;

public class Impar_Soma {

	public static void main(String[] args) {
		ArrayList<Integer> impares = new ArrayList<>();
		Integer imparsoma = 0;
		
		for(int x=0; x<=100;x++) {
			if(x%2==1) {
				impares.add(x);
			}
		}
		
		for(int x=0; x<impares.size();x++) {
			imparsoma += impares.get(x);
		}
		
		System.out.println("A soma dos impares é = "+imparsoma);

	}

}

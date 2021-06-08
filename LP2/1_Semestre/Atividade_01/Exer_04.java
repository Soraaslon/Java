package atividade_01;
import java.util.Scanner;
import java.util.ArrayList;

public class Exer_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
		Integer maior=0;
		Integer menor=0;
		
		System.out.println("Digite números positivos, para finalizar digite 0");
		do {
			numero=sc.nextInt();
			if(numero>0) {
				if(numeros.size()==0){
					maior = numero;
					menor = numero;
				}
				if (maior<numero){
					maior=numero;	
				}
				else if (menor>numero){
					menor = numero;
				}
				numeros.add(numero);
			} else if (numero<0){
				System.out.println(" * Digite um valor positivo *");
			}
		}while(numero!=0);
		
		System.out.println("\nForam armazenados "+(numeros.size())+" números\nO maior número é: "+maior+"\nO menor número é: "+menor);
		sc.close();

	}

}

package atividade_08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exer_02_InputMismatch {

	  public static void main(String[] args) {
		    
			Integer num = 0;
			Scanner sc = new Scanner(System.in);
			boolean verifica = true;
		    
			while(verifica) { // cria um loop e só o para quando o usuário digitar um valor válido
				try {
					System.out.println("Entre com um valor númerico: ");
					num = sc.nextInt();
					verifica = false; // só será executado caso todas as linhas de cima executem sem erros
					System.out.println("O número digitado foi: " + num); // exibe o número
					sc.close(); // fecha o scanner
			 	} catch(InputMismatchException e)	{
			 		System.out.println("O Valor é indevido\n-----------------------------------");
			 		sc.nextLine(); // limpando scanner
			    } 
			}
	  }
}

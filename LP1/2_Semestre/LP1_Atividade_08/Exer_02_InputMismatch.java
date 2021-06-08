package atividade_08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exer_02_InputMismatch {

	  public static void main(String[] args) {
		    
			Integer num = 0;
			Scanner sc = new Scanner(System.in);
			boolean verifica = true;
		    
			while(verifica) { // cria um loop e s� o para quando o usu�rio digitar um valor v�lido
				try {
					System.out.println("Entre com um valor n�merico: ");
					num = sc.nextInt();
					verifica = false; // s� ser� executado caso todas as linhas de cima executem sem erros
					System.out.println("O n�mero digitado foi: " + num); // exibe o n�mero
					sc.close(); // fecha o scanner
			 	} catch(InputMismatchException e)	{
			 		System.out.println("O Valor � indevido\n-----------------------------------");
			 		sc.nextLine(); // limpando scanner
			    } 
			}
	  }
}

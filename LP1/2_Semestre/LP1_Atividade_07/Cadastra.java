package atividade_07;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastra {

	public static void main(String[] args) {
	    
	    ArrayList<String> listaNomes = new ArrayList<>();
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Digite 5 nomes:");
			
			for( int cont = 0; cont <= 4  ;cont++ )	{
				listaNomes.add( scan.nextLine() );
			}
	    
			System.out.println();
			System.out.println("Nomes na ordem contrária");
	    
			for( int cont = 4 ; cont >=0 ; cont-- )	{
				System.out.println( listaNomes.get(cont) );
			}
			scan.close();
	 	}
	}

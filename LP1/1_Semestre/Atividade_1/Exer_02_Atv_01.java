import java.util.Scanner;
import java.text.DecimalFormat; 

public class Exer_02_Atv_01 {
	public static void main(String[]args) {
		
		Double macas, total;
		DecimalFormat formata = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas ma�as quer comprar: ");
		macas = sc.nextDouble();
		
		while(macas <= 0) {
			System.out.println("N�o � poss�vel comprar esse n�mero de ma�as");
			System.out.println("Digite quantas ma�as quer comprar: ");
			macas = sc.nextDouble();}
		
		if(macas<12) {
			total= macas * 0.30;
			System.out.println("O pre�o total da compra �: R$ "+formata.format(total));}
		else{
			total= macas * 0.25;
			System.out.println("O pre�o total da compra �: R$ "+formata.format(total));}
		
}}

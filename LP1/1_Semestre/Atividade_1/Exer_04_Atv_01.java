import java.util.Scanner;

public class Exer_04_Atv_01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Integer num;
		
		System.out.println("Digite um número inteiro: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("O número "+num+" é par");}
		else {
			System.out.println("O número "+num+" é impar");}
}}
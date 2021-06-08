import java.util.Scanner;
public class Exer_05_Atv_02 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Double num;
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		System.out.println("A tabuada de "+num+" é:");
		for(int i=0;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);}
		sc.close();
}}
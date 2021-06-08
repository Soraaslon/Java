import java.util.Scanner;
public class Exer_02_Atv_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer ini, fim;
		System.out.println("Digite o valor inicial da contagem: ");
		ini = sc.nextInt();
		do {
			System.out.println("Digite o número final da contagem: ");
			fim = sc.nextInt();
		}while(fim<=ini);
		while(ini<=fim) {
			System.out.println(ini);
			ini++;}
		sc.close();
}}
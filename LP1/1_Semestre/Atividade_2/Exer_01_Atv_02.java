import java.util.Scanner;
public class Exer_01_Atv_02 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Integer cont=0;
		Double num, total = 0.0;
		
		do{
			System.out.println("Digite um número inteiro positivo, para encerrar digite 0: ");
			num = sc.nextDouble();
			if(num>0) {
				total = total + num;
				cont++;}
		}while(num!=0);
		sc.close();
		if(cont>0) {
		total = (total/cont);}
		System.out.println("Foram digitados "+cont+" números\nA média é "+total);
}}
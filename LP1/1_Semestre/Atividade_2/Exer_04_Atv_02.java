import java.util.Scanner;
public class Exer_04_Atv_02 {

	public static void main(String[] args) {
		Integer n=0, x=0, vet[]= new Integer[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 n�meros: ");
		while(n<10) {
			vet[n]=sc.nextInt();
		if(n==0) {
			x= vet[n];}
		if((vet[n]>x)) {
			x=vet[n];}
		n++;}
		sc.close();
		System.out.println("O maior n�mero �: "+x);
}}
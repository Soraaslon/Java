import java.util.Scanner;
public class Exer_3 {

	public static void main(String[] args) {
		Scanner coala = new Scanner (System.in);
int a;
System.out.println(" Digite um n�mero maior que 0 : ");
a = coala.nextInt ();
if (a <= 0) {
	System.out.println(" Esse n�mero n�o � maior que 0 '-', n�o pode isso n�o");}
	else if(a % 2 == 0) {
		System.out.println(" Esse n�mero � par, muito bem :D ");}
		else 
		System.out.println(" Esse n�mero � impar, muito bem :D ");
		
}}

import java.util.Scanner;
public class Exer_3 {

	public static void main(String[] args) {
		Scanner coala = new Scanner (System.in);
int a;
System.out.println(" Digite um número maior que 0 : ");
a = coala.nextInt ();
if (a <= 0) {
	System.out.println(" Esse número não é maior que 0 '-', não pode isso não");}
	else if(a % 2 == 0) {
		System.out.println(" Esse número é par, muito bem :D ");}
		else 
		System.out.println(" Esse número é impar, muito bem :D ");
		
}}

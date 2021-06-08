import java.util.Scanner;
public class Exer_1 {

	public static void main(String[] args) {

		int a, b;
		System.out.println(" - Digite o valor de A : ");
		Scanner blz = new Scanner ( System.in );
		a = blz.nextInt();
		System.out.println("- Digite o valor de B : ");
		b = blz.nextInt ();
		if(a<b)
			System.out.println(a+" é menor");
		else if (b<a)
			System.out.println(b+" é menor ");
		else
			System.out.print(" A e B são iguais ");
	}

}

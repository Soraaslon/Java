import java.util.Scanner;
public class Exer_05_Aula2 {

	public static void main(String[] args) {

		int a[] = new int[3];
		int d,e,x;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite 3 valores:");

		for (d=0;d<3;d++) {
		a[d] = sc.nextInt();
}
		for (d=0;d<2;d++) {
			for(e=d+1;e<=2;e++) {
				if ((a[e])<(a[d])) {
					x= a[e];
					a[e]= a[d];
					a[d]=x;
}}}
		System.out.println("Os números digitados em ordem crescente são:");
		for (d=0;d<3;d++) {
			System.out.println(a[d]);
		}
	}

}

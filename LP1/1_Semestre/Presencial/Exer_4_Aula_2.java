import java.util.Scanner;
public class Exer_4_Aula_2 {

	public static void main(String[] args) {
		float a,b,c,med;
		System.out.println("Digite as suas 3 notas :");
		Scanner zc = new Scanner (System.in);
		a = zc.nextFloat();
		b = zc.nextFloat();
		c = zc.nextFloat();
		
		med = ((a+b+c)/3);
		
		if(med>=7) {
		System.out.println("Voc� Passou :D");
		}
		if(med< 7 && med >=5) {
			System.out.println("Voc� Est� de Recupera��o :|");
		}
		if (med <5){
				System.out.println("Voc� reprovou :C, se esforce mais na pr�xima vez");
			}
				
	}
}

import java.util.Scanner;

public class exer_01_aula_05 {

	public static void main(String[] args) {

		Integer i=0,g,h,f;
		Double x;
		Double u = new Double(0);
		Double notas[] = new Double [10];
		Scanner brenin = new Scanner(System.in);
		
		while (i<notas.length) {
			System.out.println("Digite a nota do "+(i+1)+"° aluno:");
			notas[i] = brenin.nextDouble();
			if((notas[i]>=0) && (notas[i]<=10)) {
			u = u+notas[i];
			i++;
			}
		}
		h=notas.length;
		System.out.println("A média da turma é:"+(u/10));
		
		
		for(i=0;i<(h-1);i++) {
			for(f=i+1;f<h;f++) {
				if(notas[i]>notas[f]) {
					x=notas[i];
					notas[i]=notas[f];
					notas[f]=x;
				}}}
		System.out.println("A maior nota é: "+notas[9]+"\nA menor nota é: "+notas[0]);
	}

}

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer_03_Atv_01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Double valor_cp, valor_vd;
		DecimalFormat formata = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor pago pelo produto");
		valor_cp = sc.nextDouble();
		
		while(valor_cp <= 0) {
			System.out.println("Esse não é um valor válido\nDigite o valor pago pelo produto");
			valor_cp = sc.nextDouble();}
		
		if(valor_cp<20) {
			valor_vd = valor_cp*1.45;
			System.out.println("O valor de venda deste produto é: R$ "+formata.format(valor_vd));}
		else{
			valor_vd = valor_cp*1.30;
			System.out.println("O valor de venda deste produto é: R$"+formata.format(valor_vd));}
		
}}

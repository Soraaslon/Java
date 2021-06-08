package atividade_08;

public class Exer_03_NullPointer {

	public static void main(String[] args) {
		
		String vazia = null;
		
			try{
				vazia.toUpperCase();
			}
			catch(NullPointerException e){
				System.out.println("Como vou usar métodos em um valor nulo? ta doido");
			}
		}
}
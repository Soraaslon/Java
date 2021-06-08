
public class Teste {
	public static void main(String[]args) {
		CartaoSIM oi = new CartaoSIM();
		System.out.println("Operadora: "+oi.getOperadora()+" - Tamanho: "+oi.getTamanho()+" - Número: "+oi.getNumero());
		oi.setNumero(34);
		System.out.println(oi.getNumero());
		
		CartaoSIM ai = new CartaoSIM("NET", "Desconhecido", 123);
		System.out.println("Operadora: "+ai.getOperadora()+" - Tamanho: "+ai.getTamanho()+" - Número: "+ai.getNumero()+"\n\n");
		
		
		
		Mobile ei = new Mobile();
		System.out.println("Modelo: "+ei.getModelo()+" - Marca: "+ei.getMarca()+" - Cartao: "+ei.getCartao().getOperadora()+" - "+ei.getCartao().getNumero());
		ei.setCartao(oi);
		System.out.println(ei.getCartao());
		
		Mobile ui = new Mobile("J5 Pro", "Samsung", ai);
		System.out.println("Modelo: "+ui.getModelo()+" - Marca: "+ui.getMarca()+" - Cartao: "+ui.getCartao());
		ui.setCartao(ai);
		System.out.println(ui.getCartao());
		
		Mobile ii = new Mobile();
		System.out.println("Modelo: "+ii.getModelo()+" - Marca: "+ii.getMarca()+" - Cartao: "+ii.getCartao());
		
		
		
		
	}
}

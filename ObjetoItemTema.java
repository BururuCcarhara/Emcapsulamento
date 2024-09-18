package Emcapsulamento;

public class ObjetoItemTema {

	public static void main(String[] args) {
		ItemTema ItemTema1 = new ItemTema (5, "marijuana", "erva cosmestivel");
		
		System.out.println(ItemTema1.getNome());
		System.out.println(ItemTema1.getId());
		System.out.println(ItemTema1.getDescricao());
		
		
		ItemTema ItemTema2 = new ItemTema (4, "tadala", "interessante");
		System.out.println(ItemTema1.getNome());
		System.out.println(ItemTema1.getId());
		System.out.println(ItemTema1.getDescricao());
	}

}
package Emcapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
		
		Tema tema1 = new Tema ("curitiba",2, 500, "Preto e branco");
		
		System.out.println(tema1.getNome());
		System.out.println(tema1.getId());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorTolha());
		
		Tema tema2 = new Tema ("curitiba",2, 500, "Preto e branco");
		System.out.println(tema2.getNome());
		System.out.println(tema2.getId());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorTolha());


	}

}

package Emcapsulamento;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("Reinaldão",3, 40028922, 000000, 123);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		Cliente cliente2 = new Cliente ("Carlão",2, 500, 111111, 456);
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
	}

}

package Emcapsulamento;

public class ObjetoEndereco {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco (5, "praça", 56, "pedregulho", "bairro Arruaceiro", "São Paulo", 456789, 55);
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
	}

}

package Emcapsulamento;

public class Cliente {
	private int id;
	private String nome;
	private int telefone;
	private int cpf;
	private int rg;
	
	public Cliente (String nome, int id, int telefone, int cpf, int rg) {
		this.nome =nome;
		setId(id);
		setTelefone(telefone);
		setCpf(cpf);
		setRg(rg);	
}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome =nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id >= 0) {
			
		} else {
			System.out.println("ID inválido! por favor informe um nuúmero maior que 0");
		}
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone (int telefone) {
		if (telefone >= 0)  {
			
		}else {
		System.out.println("Telefone inválido! por favor informe um nuúmero maior que 0");
		}
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf (int cpf) {
		if (cpf >= 0)  {
		}else {
			System.out.println("Telefone inválido! por favor informe um nuúmero maior que 0");
			}
		}
	public int getRg() {
	return rg;
	}
	public void setRg (int rg) {
	if (rg >= 0)  {
	}else {
		System.out.println("RG inválido! por favor informe um nuúmero maior que 0");
		}
	}

	
	public void exibirInformacoes() {
		System.out.println("Cliente: " + nome + ",ID:" + id +",Telefone:" + telefone +",CPF:" + cpf +" e RG: "+ rg );
	}
}



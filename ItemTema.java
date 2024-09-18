package Emcapsulamento;

public class ItemTema {
private long id;
private String nome;
private String descricao;

public ItemTema (long id, String nome, String descricao) {
	this.nome =nome;
	this.id=id;
	this.descricao=descricao;
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome =nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao (String descricao) {
		
	}
}

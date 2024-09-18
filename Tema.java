package Emcapsulamento;

public class Tema {
private String nome;
private long id;
private double valorAluguel;
private String corTolha;

public Tema (String nome, long id, double valorAluguel, String corTolha) {
	this.nome =nome;
	this.id=id;
	this.corTolha=corTolha;
	this.valorAluguel= valorAluguel;
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
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel (double valorAluguel) {
		
	}
	public String getCorTolha() {
		return corTolha;
	}
	public void setCorTolha (String corTolha) {
				
	}
}
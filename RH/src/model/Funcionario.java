package model;

public abstract class Funcionario {

	private String cpf;
	private String nome;
	private String endereco;
	private String datadeEmissao;
	private String titulacao;
	private double salarioBase;
	
	public Funcionario(String cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salario){
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.datadeEmissao = datadeEmissao;
		this.titulacao = titulacao;
		this.salarioBase = salario;
	}

	public double CalculaSalario(){
		return this.salarioBase;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDatadeEmissao() {
		return this.datadeEmissao;
	}

	public void setDatadeEmissao(String datadeEmissao) {
		this.datadeEmissao = datadeEmissao;
	}

	public String getTitulacao() {
		return this.titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String toString() {
		return "\nCPF= " + cpf + "\nnome= " + nome + "\nendereço= " + endereco + "\ndata de Emissão= "
				+ datadeEmissao + "\ntitulação= " + titulacao + "\nsalário Base= " + salarioBase;
	}
	
}

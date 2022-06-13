package model;

public class Funcionario {
	private int cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private double salarioBase;

	public Funcionario(int cpf, String nome, String endereco, String dataAdmissao, String titulacao, double salarioBase) {

		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}
	
	//gets and setters

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getdataAdmissao() {
		return dataAdmissao;
	}

	public void setdataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calculaSalario() {
		return this.salarioBase;
	}
	
	public String toString() 
	{
		return "\nCPF: " + this.cpf + "\n Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nData de Amissão:" + this.dataAdmissao + "\nTitulação: " + this.titulacao + "\nSalario base: " + this.salarioBase;
	}
	
}

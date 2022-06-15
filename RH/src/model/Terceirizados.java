package model;

public class Terceirizados extends Funcionario{
	
	private String dataFimDeContrato;
	private String funcao;
	
	public Terceirizados(String cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salario, String dataFimDeContrato, String funcao) {
		super(cpf, nome, endereco, datadeEmissao, titulacao, salario);
		this.dataFimDeContrato = dataFimDeContrato;
		this.funcao = funcao;
	}
	
	@Override
	public double CalculaSalario(){
		
			double salario = getSalarioBase();
			if(this.getTitulacao().equalsIgnoreCase("Mestre") && this.funcao.equalsIgnoreCase("Professor")) {
				salario += + 500;
			}
			if (this.getTitulacao().equalsIgnoreCase("Doutor") && this.funcao.equalsIgnoreCase("Professor")) {
				salario += + 1000;
			}
			this.setSalarioBase(salario);
			return salario;
		}
	
	@Override
	public String toString() {
		return "\nCPF: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão: " + this.getDatadeEmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\ndata de fim de contrato: " + this.dataFimDeContrato + "\nfunçao: " + this.funcao;
	}
}

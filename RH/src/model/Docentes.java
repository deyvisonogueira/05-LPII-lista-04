package model;

public class Docentes extends Funcionario {

	private int siape;
	private String area;
	
	public Docentes(String cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salario, int siape, String area) {
		super(cpf, nome, endereco, datadeEmissao, titulacao, salario);
		this.siape = siape;
		this.area = area;
	}
	
	@Override
	public double CalculaSalario(){
		double salario = getSalarioBase();
		if(this.getTitulacao().equalsIgnoreCase("Mestre")) {
			salario += getSalarioBase() * 0.2;
		}
		if (this.getTitulacao().equalsIgnoreCase("Doutor") ) {
			salario += getSalarioBase() * 0.4;
		}
		this.setSalarioBase(salario);
		return salario;
	}

	@Override
	public String toString() {
		return "\nCPF: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão: " + this.getDatadeEmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\nsiape: " + this.siape + "\narea: " + this.area;
	}
}

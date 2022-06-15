package model;

public class Tecnicos extends Funcionario{

	private int siape;
	private String departamento;
	public Tecnicos(String cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salario, int siape, String departamento) {
		super(cpf, nome, endereco, datadeEmissao, titulacao, salario);
		this.siape = siape;
		this.departamento = departamento;
	}
	
	@Override
	public double CalculaSalario(){
		
			double salario = getSalarioBase();
			if(this.getTitulacao().equalsIgnoreCase("Mestre")) {
				salario += getSalarioBase() * 0.15;
			}
			if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
				salario += getSalarioBase() * 0.3;
			}
			this.setSalarioBase(salario);
			return salario;
		}
	
	@Override
	public String toString() {
	return "\nCPF: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendere�o: " + this.getEndereco() + "\ndata de emiss�o: " + this.getDatadeEmissao() + "\ntitula��o: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
	+ "\nsiape: " + this.siape + "\ndepartamento: " + this.departamento;
	}
	}
	

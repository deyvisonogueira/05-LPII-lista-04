package model;

public class Tecnico extends Funcionario{
	private int siape;
	private String departamento;
	
	public Tecnico(int cpf, String nome, String endereco, String dataAdmissao, String titulacao, double salarioBase, int siape, String departamento) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.siape = siape;
		this.departamento = departamento;
	}

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public double calculaSalario() {
		double salarioMestre = this.getSalarioBase() + (this.getSalarioBase()*0.15);
		double salarioDoutor = this.getSalarioBase() + (this.getSalarioBase()*0.30);

		if(this.getTitulacao().equals("Mestre")) {
			return salarioMestre;
		}
		if(this.getTitulacao().equals("Doutor"))
			return salarioDoutor;

		else {
			return this.getSalarioBase();
		}
	}
}

package model;

public class Docente extends Funcionario{
	private int siape;
	private String areaVinculada;

	public Docente (int cpf, String nome, String endereco, String dataAdmissao, String titulacao, double salarioBase, int siape, String areaVinculada) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.siape = siape;
		this.areaVinculada = areaVinculada;
	}

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public String getAreaVinculada() {
		return areaVinculada;
	}

	public void setAreaVinculada(String areaVinculada) {
		this.areaVinculada = areaVinculada;
	}

	@Override
	public double calculaSalario() {
		double salarioMestre = this.getSalarioBase()+ (this.getSalarioBase()*0.20);
		double salarioDoutor = this.getSalarioBase()+ (this.getSalarioBase()*0.40);

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

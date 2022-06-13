package model;

public class Tercerizado extends Funcionario{
	private String dataFim;
	private String funcao;

	public Tercerizado(int cpf, String nome, String endereco, String dataAdmissao, String titulacao, double salarioBase, String dataFim, String funcao) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.dataFim = dataFim;
		this.funcao = funcao;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public double calculaSalario() {
		double salarioMestre = this.getSalarioBase() + 500;
		double salarioDoutor = this.getSalarioBase() + 1000;

		if(this.getFuncao().equalsIgnoreCase("Professor")) {
			if(getTitulacao().equals("Mestre")){
				return salarioMestre;
			}
			if(this.getFuncao().equals("Doutor")) {
				return salarioDoutor;
			}
			else {
				return this.getSalarioBase();
			}
		}
	}
}



package view;

import java.util.Scanner;
import model.*;

public class Menu {

	private String cpf;
	private String nome;
	private String endereco;
	private String datadeEmissao;
	private String titulacao;
	private double salarioBase;
	private int siape;
	private String area;
	private String departamento;
	private String dataFimdeContrato;
	private String funcao;
	private Scanner leitor;
		
	public Menu() {
			RH rh = new RH();
			leitor = new Scanner(System.in);
			
	}

		public int MenuFuncionario() {
		System.out.println(" ** Menu de funcionários - RH **");
		System.out.println("1 - Cadastrar um novo funcionário (Docente, Técnico ou Terceirizado)");
		System.out.println("2 - Pesquisar por um funcionário");
		System.out.println("3 - Listar todos os funcionários");
		System.out.println("0 - Para sair");
		System.out.print("Digite a opção desejada: ");
		int op = leitor.nextInt();
		return op;
		}
	
	private void informacoesFuncionario() {
		
		System.out.println("CPF: ");
        this.cpf = leitor.next();
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Endereço: ");
        this.endereco = leitor.next();
        System.out.println("data de emissão: ");
        this.datadeEmissao = leitor.next();
        System.out.println("titulação: ");
        this.titulacao = leitor.next();
        System.out.println("salario base: ");
        this.salarioBase = leitor.nextDouble();
}
	public Docentes informacoesDocentes() {
		informacoesFuncionario();
		System.out.println("Siape: ");
		this.siape = leitor.nextInt();
		System.out.println("área: ");
		this.area = leitor.next();
		Docentes d = new Docentes(this.cpf,this.nome,this.endereco,this.datadeEmissao,this.titulacao,this.salarioBase, this.siape,this.area);
		d.CalculaSalario();
		return d;
	}
	
	public Tecnicos informacoesTecnicos() {
		informacoesFuncionario();
		System.out.println("Siape: ");
		this.siape = leitor.nextInt();
		System.out.println("Departamento: ");
		this.departamento = leitor.next();
		Tecnicos tec = new Tecnicos(this.cpf,this.nome,this.endereco,this.datadeEmissao,this.titulacao,this.salarioBase, this.siape,this.departamento);
		tec.CalculaSalario();
		return tec;
	}
	
	public Terceirizados informacoesTerceirizados() {
		informacoesFuncionario();
		System.out.println("Data do Fim de Contrato: ");
		this.dataFimdeContrato = leitor.next();
		System.out.println("Função: ");
		this.funcao = leitor.next();
		Terceirizados ter = new Terceirizados(this.cpf,this.nome,this.endereco,this.datadeEmissao,this.titulacao,this.salarioBase,this.dataFimdeContrato,this.funcao);
		ter.CalculaSalario();
		return ter;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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

	public String getDatadeEmissao() {
		return datadeEmissao;
	}

	public void setDatadeEmissao(String datadeEmissao) {
		this.datadeEmissao = datadeEmissao;
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

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataFimdeContrato() {
		return dataFimdeContrato;
	}

	public void setDataFimdeContrato(String dataFimdeContrato) {
		this.dataFimdeContrato = dataFimdeContrato;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}

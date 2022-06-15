package model;

import java.util.ArrayList;

public class RH {

	private ArrayList<Funcionario> Funcionarios = new ArrayList<>();

public void AdicionarFuncionario(Funcionario f) {
	Funcionarios.add(f);
}

public Funcionario pesquisaFuncionario(String nome) {
	for(Funcionario f : Funcionarios){
		if(f.getNome().equalsIgnoreCase(nome)) {
			return f;
		}
	}
	return null;
}

public ArrayList<Funcionario> getFuncionarios()
{
	return Funcionarios;
}
}
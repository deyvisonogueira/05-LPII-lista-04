package view;

import java.util.Scanner;
import model.*;

public class Main {

	public static void main(String[] args) {
				Scanner leitor = new Scanner(System.in);
				Menu menu = new Menu();
				RH rh = new RH();
				int opAdd = 0;
		do {
		switch(menu.MenuFuncionario()){
		case 1:
			System.out.println("1 - Docente");
			System.out.println("2 - Técnico");
			System.out.println("3 - Terceirizado");
			opAdd = leitor.nextInt();
			switch(opAdd) {
			case 1:
				rh.AdicionarFuncionario(menu.informacoesDocentes());
				break;
			case 2: 
				rh.AdicionarFuncionario(menu.informacoesTecnicos());
				break;
			case 3: 
				rh.AdicionarFuncionario(menu.informacoesTerceirizados());
				break;
			}
			break;
		case 2: 
			System.out.println("Nome do funcionário que você deseja buscar:");
			String nome = leitor.next();
			System.out.println(rh.pesquisaFuncionario(nome));
			break;
		case 3: 
			System.out.println(rh.getFuncionarios());
			break;
		case 0: 
			break;
			default: 
				System.out.println("Opção Inválida");
				break;
		}
		}
		while(opAdd != 0);
	}
}

package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Yahoo");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		
		Banco.listaEmpresas.add(empresa);		
		
	}
	public List<Empresa> getEmpresas(){
		
		return Banco.listaEmpresas;
		
		
		
	}
	
}

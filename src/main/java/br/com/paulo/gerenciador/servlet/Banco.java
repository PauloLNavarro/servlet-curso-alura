package br.com.paulo.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {

		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Google");
		lista.add(empresa);
		lista.add(empresa2);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void adicionar(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}

		}

	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				return emp;
			}

		}

		return null;
	}

}

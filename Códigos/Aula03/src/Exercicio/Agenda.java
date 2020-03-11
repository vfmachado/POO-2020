package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Contato> lista;
	
	public Agenda() {
		lista = new ArrayList<Contato>();
	}

	//neste momento, não estamos fazendo verificação se o contato já existe.
	public void addContato(Contato contato) {
		lista.add(contato);
	}
	
}

package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Contato> lista;
	
	public Agenda() {
		lista = new ArrayList<Contato>();
	}

	//neste momento, n�o estamos fazendo verifica��o se o contato j� existe.
	public void addContato(Contato contato) {
		lista.add(contato);
	}
	
}

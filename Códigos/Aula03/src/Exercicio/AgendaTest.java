package Exercicio;

public class AgendaTest {

	public static void main(String [] args) {
		
		Agenda agenda = new Agenda();
		
		Contato contato;
		
		contato = new Contato("Vinicius", "12312312312");
		agenda.addContato(contato);
		
		contato = new Contato("Cristiana", "31231231232");
		agenda.addContato(contato);
		
		contato = new Contato();
		contato.setNome("Alexandre");
		contato.setEmail("ale@gmail.com");
		agenda.addContato(contato);
		
		for (Contato c : agenda.listaContatos()) {
			System.out.println(c.getNome() + "\t" + c.getTelefone());
		}
		
		//deve retornar
		// Vinicius		12312312312
		// Cristiana	31231231232
		
		/*
		NO MAIN:
			FAZER UM MENU COM AS OPÇÕES
			1. ADICIONAR CONTATO
				CRIA UM NOVO CONTATO E ADICIONA NA AGENDA
			2. BUSCAR CONTATO
				BUSCA PELO NOME E RETORNA A LISTA DE CONTATOS QUE CONTEM AQUELA SUBSTRING
			3. LISTAR TODOS CONTATOS
				RETORNA UMA LISTA COM TODOS OS CONTATOS E MOSTRA NA TELA.
			4. REMOVER CONTATO
				REMOVE CONTATO PELO NOME COMPLETO
			5. EDITAR CONTATO
				PERMITE EDITAR QUALQUER INFORMAÇÃO DO CONTATO
		 */
		
		/*
		CONTATO: NOME, EMAIL, TELEFONE.
		TELEFONE TEM EXATAMENTE 11 DIGITOS
		EMAIL OBRIGATORIAMENTE TEM UM @ E UM PONTO.
		NOME - NÃO PODE SER VAZIO.
		
		AGENDA: TEM OS MÉTODOS PARA GERENCIAR OS CONTATOS
		
		 */
		
		
	}
	
}

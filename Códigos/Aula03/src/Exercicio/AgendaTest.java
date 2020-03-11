package Exercicio;

public class AgendaTest {

	public static void main(String [] args) {
		
		Contato contato1 = new Contato("Vinicius", "12312312312");
		Agenda agenda = new Agenda();
		agenda.addContato(contato1);
		
		for (Contato c : agenda.listaContatos()) {
			System.out.println(c.getNome() + "\t" + c.getTelefone());
		}
		
		/*
		NO MAIN:
			FAZER UM MENU COM AS OP��ES
			1. ADICIONAR CONTATO
				CRIA UM NOVO CONTATO E ADICIONA NA AGENDA
			2. BUSCAR CONTATO
				BUSCA PELO NOME E RETORNA A LISTA DE CONTATOS QUE CONTEM AQUELA SUBSTRING
			3. LISTAR TODOS CONTATOS
				RETORNA UMA LISTA COM TODOS OS CONTATOS E MOSTRA NA TELA.
			4. REMOVER CONTATO
				REMOVE CONTATO PELO NOME COMPLETO
			5. EDITAR CONTATO
				PERMITE EDITAR QUALQUER INFORMA��O DO CONTATO
		 */
		
		/*
		CONTATO: NOME, EMAIL, TELEFONE.
		TELEFONE TEM EXATAMENTE 11 DIGITOS
		EMAIL OBRIGATORIAMENTE TEM UM @ E UM PONTO.
		NOME - N�O PODE SER VAZIO.
		
		AGENDA: TEM OS M�TODOS PARA GERENCIAR OS CONTATOS
		
		 */
		
		
	}
	
}

package GetSet;

public class PessoaTest {

	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa("Vinicius");
		
		System.out.println("NOME: " + p.getNome() + "\tCPF: " + p.getCPF());

		System.out.println(p.getEstadoCivil());
		
		p.setEstadoCivil("Casado");
		System.out.println("Então... " + p.getEstadoCivil());

		
	}

}

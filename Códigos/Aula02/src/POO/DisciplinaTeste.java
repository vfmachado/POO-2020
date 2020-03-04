package POO;

public class DisciplinaTeste {

	public static void main(String[] args) {
		
		System.out.println("Programa para testar a classe disciplina");
		
		Disciplina disciplina;
		System.out.println("Declarei a disciplina");
		
		disciplina = new Disciplina("POO");
		System.out.println("Instanciei a disciplina");
		
		System.out.println(disciplina.getNome());
		
		float notas[] = {-1, 10, 4, 8};
		disciplina.setNotas(notas);
		
		for (int i = 0; i < disciplina.getNotas().length; i++) {
			System.out.println(disciplina.getNotas()[i]);
		}
	}
	
}

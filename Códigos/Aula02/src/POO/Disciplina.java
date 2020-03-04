package POO;

public class Disciplina {

	//atributos privados - apenas a própria classe pode manipular estes atributos
	private String nome;
	private float notas[];
	
	//método construtor
	/*
	 * configuramos o estado inicial da classe, setando os estados
	 * de cada um dos atributos.
	 * 
	 */
	public Disciplina(String nomeDaDisciplina) {
		System.out.println("Construindo o objeto...");
		nome = nomeDaDisciplina;
		notas = new float[0];
	}
	
	//métodos => normalmente são públicos para que determinem
	//de que maneira utilizaremos a classe.
	//podem existir métodos privados, sempre são auxiliares para a própria classe.
	public String getNome() {
		return nome;
	}

	public float[] getNotas() {
		return notas;
	}
	
	public void setNotas(float[] novasNotas) {
		for (int i = 0; i < novasNotas.length; i++) {
			if (novasNotas[i] < 0 || novasNotas[i] > 10) {
				return;
			}
		}
		notas = novasNotas;
	}
	
	//EXERCÍCIO - TRANSFORMAR AS CONSULTAS DA CLASSE REVISAOVETORES/VETORES.JAVA EM MÉTODOS DA DISCIPLINA
	//TODOS OS MÉTODOS SERÃO PÚBLICOS E TERÃO ALGUM TIPO DE RETORNO
	
	//REGRA IMPORTANTE: A CLASSE NÃO POSSUI SCANNER, SYSTEM.OUT, NENHUM TIPO DE INTERAÇÃO COM O USUÁRIO
}

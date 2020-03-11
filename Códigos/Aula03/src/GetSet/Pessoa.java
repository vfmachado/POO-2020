package GetSet;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String estadoCivil;
	
	private static List<String> estadosPossiveis = Arrays.asList("Casado", "Solteiro", "União");
	
	public Pessoa(String novoNome) {
		nome = novoNome;
		cpf = EntidadeGeradora.geraCPF();
		estadoCivil = "Solteiro";
	}

	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	/*
	public void setEstadoCivil(String novoEstado) {
		if (estadosPossiveis.contains(novoEstado)) {
			estadoCivil = novoEstado;
		}
	}
	*/
	
	public void setEstadoCivil(String estadoCivil) {
		if (estadosPossiveis.contains(estadoCivil)) {
			this.estadoCivil = estadoCivil;
		}
	}
	
	public String getEstadoCivil() {
		return "Estado civil: " + estadoCivil;
	}
}

package RevisaoVetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraysEArrayList {

	public static void main(String[] args) {
		
		// <generics> => veremos no final do curso
		List<String> nomes = new ArrayList<String>();
		
		//add para adicionar elementos
		nomes.add("Vinicius");
		nomes.add("Roger");
		nomes.add("Guilherme");
		nomes.add("Bruna");
		
		//clear
		
		//contains
		System.out.println(nomes.contains("Vinicius"));
		boolean resultado = nomes.contains("Bruna");
		
		//get => retorna um elemento da lista baseado no índice
		String umNome = nomes.get(0);
		
		//indexOf => em que índice está a palavra 
		int indexOfVini = nomes.indexOf("Vinicius");
		
		//remove
		nomes.remove(2);
		
		System.out.println(nomes.size());
		
				
		//for melhorado / foreach
		for (String cadaNome : nomes) {
			System.out.println(cadaNome);
		}
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
	}

}

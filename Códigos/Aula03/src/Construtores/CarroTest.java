package Construtores;

public class CarroTest {

	public static void main(String[] args) {
		
		//isso funciona mesmo a classe carro tendo nada.
		Carro carro = new Carro();	
		//funciona pq o compilador criou a método construtor vazio
		
		//marca não tem a visibilidade declarada, logo é public package
		carro.marca = "Honda";
		
		//não funciona, pois o construtor foi declarado
		//Personagem p = new Personagem();
		
		Personagem p = new Personagem("JavaBot");
		
		
	}

}

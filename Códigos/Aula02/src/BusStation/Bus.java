package BusStation;

import java.util.List;

public class Bus {

	private String id;
	private String origem;
	private String destino;
	private int lugares;
	private float valorPassagem;
	
	private float total;
	
	public Bus(String id, String origem, String destino, int lugares, float valor) {
		
	}
	
	public boolean comprar(int lugar) {
		return false;
	}
	
	public List<Integer> lugaresVagos() {
		return null;
	}
	
	public boolean cancelar(int lugar) {
		return false;
	}
	
	public float totalArrecadado() {
		return 0.0f;
	}
	
	public String getDescricao() {
		return "";
	}
}

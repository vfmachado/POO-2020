package ExercicioAlarme;

public class Horario {

	private int horas;
	private int minutos;
	private int segundos;
	
	public Horario() {
		this(0, 0, 0);
	}
	
	public Horario(int horas, int minutos) {
		/*
		this.hora = hora;
		this.minuto = minuto;
		segundo = 0;
		*/
		this(horas, minutos, 0);
	}
	
	
	public Horario(int horas, int minutos, int segundos) {
		
		this.setHoras(horas);
		
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return this.horas;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	
	public void setHoras(int horas) {
		if (horas < 0 || horas > 23) {
			this.horas = 0;
		} else {
			this.horas = horas;
		}
	}
}

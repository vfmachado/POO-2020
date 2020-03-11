package ExercicioAlarme;

public class Alarme {

	private Horario horaInicial;
	private Horario horaFinal;
	
	public void setHoraInicial(Horario horario) {
		this.horaInicial = horario;
	}
	
	public void setHoraFinal(Horario horario) {
		this.horaFinal = horario;
	}

	public String quantoTempoFalta() {
	
		int qtdHoras = horaFinal.getHoras() - horaInicial.getHoras();
		int qtdMinutos = horaFinal.getMinutos() - horaInicial.getMinutos();
		
		
		if (qtdMinutos < 0) {
			qtdMinutos += 60;
			qtdHoras--;
		}
		
		if (qtdHoras < 0) {
			qtdHoras += 24;
		}
		
		
		return "" + qtdHoras + " horas " + qtdMinutos + " minutos";
		
	}
	
}

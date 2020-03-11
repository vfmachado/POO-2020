package ExercicioAlarme;

public class AlarmeTest {

//A IDEIA É QUE EU CONFIGURE UM ALARME PARA CERTO HORARIO
//E O PROGRAMA CALCULE, UTILIZANDO A CLASSE ALARME, QUANTAS HORAS / MINUTOS / SEGUNDOS
//IRÃO SE PASSAR

//A CLASSE ALARME NÃO FARÁ TUDO SOZINHA, ELA UTILIZARÁ A CLASSE HORARIO PARA
//CONFIGURAR AS INFORMAÇÕES DE HORA, MINUTO E SEGUNDO.
	
/*
Horario: hora, minuto, segundo
Alarme: horarioInicial, horarioFinal, quantoTempoDormirei
 */
	
	public static void main(String[] args) {
				
		Horario horaInicial = new Horario(0, 31);
		Horario horaFinal = new Horario(7, 30);
		
		Alarme alarme = new Alarme();
		alarme.setHoraInicial(horaInicial);
		alarme.setHoraFinal(horaFinal);
		
		System.out.println(alarme.quantoTempoFalta());
		//1h e 20min
		
	}
	
	
}

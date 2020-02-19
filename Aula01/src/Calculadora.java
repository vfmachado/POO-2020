
public class Calculadora {

	double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	
	double sub(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		return resultado;
	}
	
	double mul(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	//ESTUDAR!
	double div(double valor1, double valor2) {
		if (valor2 == 0) {
			return 0;
		}
		return valor1/valor2;
	}
	
	double resto(double valor1, double valor2) {
		return valor1 % valor2;
	}

	double potencia(double valor1, double valor2) {
		
		double res = 1;
		for (int i = 0; i < valor2; i++) {
			res *= valor1;
		}
		return res;
	}
}



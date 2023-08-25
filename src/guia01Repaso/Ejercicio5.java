package guia01Repaso;

public class Ejercicio5 {

	/* Resolver: Se ingresa un valor numérico de 8 dígitos que representa una fecha con 
	 * el siguiente formato aaaammdd. Se pide informar por separado el día, el mes y el
	 *  año de la fecha ingresada.
	*/
	
	public static void diaMesAnio(int fecha) {
	int dia, mes, anio;
	
	dia = fecha % 100;
	
	mes = fecha / 100 % 100;
	
	anio = fecha / 10000;
	
	System.out.println("Dia: "+ dia + ", Mes: "+ mes + ", Año: "+ anio);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		diaMesAnio(20071223);
		diaMesAnio(20130414);
		diaMesAnio(19930531);
		diaMesAnio(19910728);
		diaMesAnio(19970310);
	}

}

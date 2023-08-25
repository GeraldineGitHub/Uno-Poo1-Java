package guia01Repaso; 

public class Ejemplo7 {

	/*Leer tres valores numéricos enteros, indicar cual es el mayor, 
	 * cuál es el del medio y cuál el menor. Considerar que los tres
	 *  valores son diferentes.
	 */
	
	public static void menorMedioMayor(int a, int b, int c) {
		int menor, medio, mayor;
		
		mayor = a;
		if (b > mayor) {
			medio = mayor;
			mayor = b;
		} else
			medio = b;

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else if (c > medio) {
			menor = medio;
			medio = c;
		} else
			menor = c;
		System.out.println("Mayor: " + mayor);
		System.out.println("Medio: " + medio);
		System.out.println("Menor: " + menor);
		System.out.println("------------------");
		System.out.println("                  ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menorMedioMayor(5, 2, 9);
		menorMedioMayor(12, 6, 1);
		menorMedioMayor(34, 5, 23);
		menorMedioMayor(0, 8, 5);
		menorMedioMayor(23, 11, 7);
		menorMedioMayor(9, 1, 5);
	}

}

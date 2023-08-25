package guia01Repaso;

public class Ejemplo8 {

	
	/* Resolver: Desarrollar una función que muestre por pantalla los primeros
	 *  n números naturales considerando al 0 (cero) como primer número natural, 
	 *  siendo n un valor que se pasa por parámetro.
	 */
	
	public static void primerosNnumeros(int a) {
		for(int i = 0 ; i <= a; i++) {
			System.out.println(i);	
			}
		System.out.println("--------------------");
		System.out.println("                    ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    primerosNnumeros(12);
    primerosNnumeros(5);
    primerosNnumeros(7);
    primerosNnumeros(4);
	}

}

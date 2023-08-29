package guia01Repaso;

import java.util.Scanner;

public class Ejercicio20 {

	// Resolver: Concatenar dos cadenas (función concatenarCadena)
	
	public static void concatenarCadena(String c, String d) {
		System.out.println("La cadena conatenada es: " + c.concat(d)); // NOTA: este metodo
		                                                        // sirve para concatenar cadenas.
	}
	
	public static void main(String[] args) {
		Scanner cadena1 = new Scanner(System.in);
		Scanner cadena2 = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena: ");
		String a = cadena1.nextLine();
		
		System.out.println("Ingrese otra cadena: ");
		String b = cadena2.nextLine();
		
		concatenarCadena(a, b);

		cadena1.close();
		cadena2.close();
	}

}

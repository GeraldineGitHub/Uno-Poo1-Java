package guia01Repaso;

import java.util.Scanner;

public class Ejercicio19 {

	// RESOLVER: Determinar si una cadena es vacía (función esVacia).
	
	public static boolean esVacia(String c) {
		return c.isEmpty();  
	}
	
	public static void main(String[] args) {
		Scanner cadVacia = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena");
		String b = cadVacia.nextLine();
		
		System.out.println("La cadena ingresada es ¿vacia o no? : " + esVacia(b));
    cadVacia.close();
	}

}

//NOTA: el metodo ' isEmpty() '  me dice si una cadena es vacia o no,
// solo esta disponible para objetos de tipo String.
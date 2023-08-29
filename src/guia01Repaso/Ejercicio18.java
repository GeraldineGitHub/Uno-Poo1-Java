package guia01Repaso;

import java.util.Scanner;

public class Ejercicio18 {

	//Resolver: Determinar la longitud de una cadena (función longitud)
	
	public static int longitud(String c) {
	
		return c.length();// Nota: Este metodo calcula la longitud de una cadena.
	}
	
	public static void main(String[] args) {
		Scanner longitud1 = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena");
		
		String b = longitud1.nextLine(); // Nota: Lee una línea de entrada
        int respuesta = longitud(b);
        
        System.out.println("La longitud de la cadena es: "+ respuesta);

        longitud1.close(); //Nota: cerrar el scanner cuando termine de usarlo.
	}

}

package guia01Repaso;

import java.util.Scanner;

public class Ejercicio21 {

	// Resolver: Comparar cadenas (función comparaCadenas).
	
	public static void compararCadenas(String c, String d) {
		if(c.equals(d)) {//NOTA: este metodo compara dos cadenas que son objetos 
			System.out.println("Las cadenas son iguales ");
	}
		else {
			System.out.println("Las cadenas son diferentes ");
		}
	}	
	
	public static void main(String[] args) {
		Scanner cadena1 = new Scanner(System.in);
		Scanner cadena2 = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena: ");
		String a = cadena1.nextLine();
		
		System.out.println("Ingrese otra cadena: ");
		String b = cadena2.nextLine();
		
		compararCadenas(a, b);

		cadena1.close();
		cadena2.close();
	}

}

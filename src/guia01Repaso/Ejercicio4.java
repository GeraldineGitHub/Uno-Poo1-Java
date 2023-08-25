package guia01Repaso;

import java.util.Scanner;

public class Ejercicio4 {

	// Dado un valor numérico entero, informar si es par o impar:
	
	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println(esPar(3));
    System.out.println(esPar(4));
    System.out.println(esPar(5));
    System.out.println(esPar(1));
    System.out.println(esPar(2));
    System.out.println(esPar(8));
	}

}

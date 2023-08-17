package guia01Repaso;

import java.util.Scanner;

//Realizar: Leer dos valores enteros e informar la suma.

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, suma;
		
		Scanner numero = new Scanner(System.in); //entrada de datos por teclado.
	
		System.out.println("Ingrese un numero entero: "); //salida de datos a consola
		a = numero.nextInt(); //Lee un entero.
		
		System.out.println("Ingrese otro numero entero: "); //salida de datos a consola
		b = numero.nextInt(); // Lee un entero.
		
		numero.close();
		suma = a + b;
		
		System.out.println("La suma de los dos enteros es: " + suma); //salida de datos a consola
	}
}

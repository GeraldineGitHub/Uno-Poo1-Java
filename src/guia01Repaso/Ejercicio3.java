package guia01Repaso;

import java.util.Scanner; 

// Resolver: Leer dos valores numéricos enteros e informar su cociente
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		double cociente; 
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		a = numero.nextInt();
		
		System.out.println("Ingrese otro numero distinto de cero: ");
		b = numero.nextInt();
		
		cociente = a / b;
		
		System.out.println("El cociente es: "+ cociente);
	}

}

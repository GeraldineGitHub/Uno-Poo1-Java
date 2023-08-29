package guia01Repaso;

import java.util.Scanner;

public class Ejerdcicio24 {

	/* RESOLVER: Escribir una función que reciba un arreglo de enteros
	 *  y devuelva true si el arreglo está ordenado de mayor a menor y false 
	 *   si está desordenado.
	 */
	
	public static boolean ordenadoOdesordenado(int[] numeros) {
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i-1] < numeros[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int a;
		
    System.out.println("¿Cuantos numeros desea ingresar?: ");
    a = numeros.nextInt();
    
    int arregloDeNumero[] = new int[a];
    
    for(int i=0; i<a; i++) {
    	System.out.println("Ingrese el numeros " + (i+1) + ": ");
    	arregloDeNumero[i] = numeros.nextInt();
    }
    System.out.println("Los numeros ingresados, ¿estan ordenados de mayor a menor? " + (ordenadoOdesordenado(arregloDeNumero)));
	}

}

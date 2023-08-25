package guia01Repaso;

import java.util.Scanner;


public class Ejemplo6 {
	
	//Resolver: Dados dos valores numéricos enteros, indicar cuál es el mayor y cuál es el menor.
	// Considerar que ambos valores son diferentes.

	public static int mayor(int a, int b) {
		if(a > b) {
			return a;
		}
		else 
			return b;
	}
	
	public static int menor(int a, int b) {
		if(a < b) {
			return a;
		}
		else 
			return b;
	}
	
	
	public static void menorMayor(int a, int b) {
	
		System.out.println("El mayor es: "+ mayor(a , b));
		System.out.println("El menor es: "+ menor(a , b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    menorMayor(8 , 2);
    menorMayor(1 , 45);
    menorMayor(3 , 9);
    menorMayor(0 , 32);
    menorMayor(67 , 4);
    menorMayor(54 , 6);
	}

}

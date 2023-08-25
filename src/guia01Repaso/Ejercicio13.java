package guia01Repaso;

import java.util.Scanner;

public class Ejercicio13 {

	/* Resolver: Determinar el menor valor de un conjunto de números e indicar 
	 * también su posición relativa dentro del mismo. El ingreso de datos finaliza 
	 * con la llegada de un cero.
	 */
	
	public static int menorValorPosicionRelativa(int[] numeros) {
		int menor = numeros [0];
		
			for(int i = 1; i< numeros.length; i++) {
				
				if(numeros[i] < menor) {
				 menor = numeros[i];
				}
		    }
			return menor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Scanner numero = new Scanner(System.in);
		int b;
           
  		 System.out.println("Bienvenido ingrese la cantidad de numeros que deseas ingresar: ");
         System.out.println("                                            ");
         System.out.println("Para finalizar el programa ingrese el 0");
     
         
    while(true) {
        b = numero.nextInt();
    	
    	if(b == 0) {
    		break; //Si se ingresa 0, termina el bucle
    	}
    	
    	else if(b != 0) {
             //System.out.println("Debe ingresar al menor un numero");
  
             int[] numeros = new int[b]; //creo un arreglo para almacenar los numeros.
             
             for(int i = 0; i < b; i++) {
            	 System.out.println("Ingresa el numero: "+ (i+1) + ":");
            	 numeros[i] = numero.nextInt();
             }
             
             int total = menorValorPosicionRelativa(numeros);
             System.out.print("El menor valor es: "+ total);
    	}
    	
    }
    numero.close();
	}

}

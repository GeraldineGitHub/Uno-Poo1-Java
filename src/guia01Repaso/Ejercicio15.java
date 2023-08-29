package guia01Repaso;

public class Ejercicio15 {

	//Resolver: Determinar si un carácter es un dígito numérico (función esDigito(char c)). 

	
	public static boolean esDigito(char c) {
		return Character.isDigit(c); //Nota: este metodo devuelve TRUE si el caracter C es un 
		                             //digito numerico y FALSE en caso contrario. 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
 	System.out.println(esDigito('d'));
	System.out.println(esDigito('4'));
	System.out.println(esDigito('l'));
	System.out.println(esDigito('0'));
	System.out.println(esDigito('B'));
	}

}

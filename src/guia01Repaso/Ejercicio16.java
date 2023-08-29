package guia01Repaso;

public class Ejercicio16 {

	//Resolver: Determinar si un carácter es una letra (función esLetra(char c)).
	
	public static boolean esLetra(char c) {
		return Character.isLetter(c); //NOTA: Este metodo devuelve TRUE si el 
		                              //caracter C es una letra y False en caso 
		                              //contrario.
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(esLetra('a'));
    System.out.println(esLetra('3'));
    System.out.println(esLetra('8'));
    System.out.println(esLetra('p'));
    System.out.println(esLetra('h'));
    System.out.println(esLetra('7'));
	}

}

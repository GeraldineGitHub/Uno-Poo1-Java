package guia01Repaso;

public class Ejercicio17 {

	/* Resolver: Determinar si un carácter es una letra mayúscula
	 *  o minúscula (función esMayuscula(char c) y esMinuscula(char c)).
	 */
	
	public static boolean esMayuscula(char c) {
		 return Character.isUpperCase(c);
	}
	
	public static boolean esMinuscula(char c) {
		return Character.isLowerCase(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Es una letra mayuscula?");
		System.out.println(esMayuscula('d'));
		System.out.println(esMayuscula('P'));
		System.out.println(esMayuscula('a'));
		System.out.println(esMayuscula('C'));
		System.out.println("------------------------");
		System.out.println("                        ");
		System.out.println("¿Es una letra minuscula?");
		System.out.println(esMinuscula('V'));
		System.out.println(esMinuscula('b'));
		System.out.println(esMinuscula('O'));
		System.out.println(esMinuscula('F'));
		System.out.println("------------------------");
	}

}

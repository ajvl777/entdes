package ejercicios;

import java.io.IOException;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String concatenacion = concatena2Strings("Hola","�que tal?");
//		System.out.println(concatenacion);
//		
//		System.out.println(recibeCharCorrespondienteAEntero(70));
		
//		int caracter = devuelveEnteroCorrespondienteAChar('A');
//		System.out.println(caracter);
		
		cuentaAtras(20,2);

	}
	
	static String concatena2Strings(String cadena1 , String cadena2) {
		
		return cadena1+" "+cadena2;
	}
	
	static char recibeCharCorrespondienteAEntero(int num) {
		return (char)num;
	}
	
	static int devuelveEnteroCorrespondienteAChar(char caracter) {
		
		return caracter;
	}
	
//	Implementa, dentro de la clase �Metodos�, un m�todo que reciba dos variables de tipo int 
//	como par�metros. El m�todo imprimir� por pantalla una cuenta atr�s hasta 0. La primera 
//	variable indicar� el n�mero a partir del cual hay que empezar a contar hacia atr�s, mientras 
//	que la segunda indicar� cuantos n�meros hay que restar para la cuenta.
//	Ejemplo:
//	Si se llama al m�todo utilizando la siguiente sintaxis: �metodo(51, 5);�
//	La salida ser�: 51, 46, 41, 36, 31, 26, 21, 16, 11, 6, 1
//	
	
	static void cuentaAtras(int inicio , int resta) {
		
		do {
			System.out.println(inicio);
			inicio=inicio-resta;
			if(inicio<1) {
				inicio=0;
				System.out.println(inicio);
			}
			
		}while(inicio !=0);
	}

}

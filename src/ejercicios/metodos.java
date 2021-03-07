package ejercicios;

import java.io.IOException;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String concatenacion = concatena2Strings("Hola","¿que tal?");
//		System.out.println(concatenacion);
//		
//		System.out.println(recibeCharCorrespondienteAEntero(70));
		
//		int caracter = devuelveEnteroCorrespondienteAChar('A');
//		System.out.println(caracter);
		
		multiplosDe3(30);

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
	
//	30. Implementa, dentro de la clase ‘Metodos’, un método que imprima por pantalla los 
//	múltiplos de 3 existentes desde 0 hasta un número entero que reciba como parámetro.
	
	static void multiplosDe3(int numFinal){
		int multiplo=1;
	
		while(multiplo<=numFinal){
			if(multiplo%3==0) {
				System.out.print(multiplo+ " ");
			}
			multiplo++;
		}
		
	}


}

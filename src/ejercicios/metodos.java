package ejercicios;

import java.io.IOException;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String concatenacion = concatena2Strings("Hola","¿que tal?");
//		System.out.println(concatenacion);
//		
//		System.out.println(recibeCharCorrespondienteAEntero(70));
		
		int caracter = devuelveEnteroCorrespondienteAChar('A');
		System.out.println(caracter);

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

}

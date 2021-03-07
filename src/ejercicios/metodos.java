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
		
		
		
		
//<<<<<<< HEAD
//	 	multiplosDe3(30);
// =======
//		 cuentaAtras(20,2);
// >>>>>>> refs/heads/nueva_funcionalidad

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
	
//<<<<<<< HEAD

	
	static void multiplosDe3(int numFinal){
		int multiplo=1;
	
		while(multiplo<=numFinal){
			if(multiplo%3==0) {
				System.out.print(multiplo+ " ");
			}
			multiplo++;
		}
		
	}

//=======

	
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
//>>>>>>> refs/heads/nueva_funcionalidad

}

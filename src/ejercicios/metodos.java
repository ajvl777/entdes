package ejercicios;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String concatenacion = concatena2Strings("Hola","�que tal?");
		System.out.println(concatenacion);

	}
	
	static String concatena2Strings(String cadena1 , String cadena2) {
		return cadena1+" "+cadena2;
	}

}


//Lo primero que haremos será importar el paquete de lectura.
import java.util.Scanner; //Este es el paquete de lectura
//Ahora vamos a poner el nombre de la clase

class Preguntas { // recuerden que el nombre de la clase es en mayúscula
	public static void main(String... Args) { // Este es el método principal
		// Declaramos algunas variables
		char res; // esta nos servirá para guardar la respuesta
		Scanner lector = new Scanner(System.in);
		System.out.println("¿Cristóbal Colón descubrió América?");
		res = lector.next().charAt(0); // Con esto leemos la respuesta
		if (res == 's') { // Verificamos que la respuesta sea si y pasamos a lo
							// siguiente
			System.out.println("¿Java es un lenguaje de programación?");
			res = lector.next().charAt(0); // Con esto leemos la respuesta
			if (res == 's') {
				System.out.println("¿Microsoft Word es un programa de computadora?");
				res = lector.next().charAt(0); // Con esto leemos la respuesta
				if (res == 's')
					System.out.println("Felicidades has ganado!");
				else
					System.out.println("Lo siento has perdido!");
			} else
				System.out.println("Lo siento ha perdido!");
		} else
			System.out.println("Lo siento ha perdido!");
	}
	
}
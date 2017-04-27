//Lo primero que haremos será importar el paquete de lectura.
import java.util.Scanner; //Este es el paquete de lectura
//Ahora vamos a poner el nombre de la clase

/**
 * <h2>	Juego preguntas </h2>
 * En esta clase presentamos el juego preguntas, donde se realizarán preguntas y se responderá con si o no
 * tras leer las respuestas todas juntas se motrará un mensaje si has ganado o has perdido.
 * @author carlospc
 */
public class Preguntas {
	
	// Declaramos algunas variables
	public char res; // esta nos servirá para guardar la respuesta
	
		public void Preguntas1() {


		Scanner lector = new Scanner(System.in);
		System.out.println("¿Cristóbal Colón descubrió América?");
		res = lector.next().charAt(0); // Con esto leemos la respuesta
		
		
		
		if (res == 's') { // Verificamos que la respuesta sea si y pasamos a lo siguiente
			/**
			 * En este método comprobamos si la respuesta es <b>correcta</b>.
			 * @author carlospc
			 */
			System.out.println("¿Java es un lenguaje de programación?");
		
			res = lector.next().charAt(0); // Con esto leemos la respuesta
			if (res == 's') {
				System.out.println("¿Microsoft Word es un programa de pc?");
				
				/**
				 * En este método comprobamos si la respuesta es <b>incorrecta</b>.
				 * @author carlospc
				 */
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

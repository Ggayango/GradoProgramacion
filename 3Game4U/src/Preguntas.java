//Lo primero que haremos ser� importar el paquete de lectura.
import java.util.Scanner; //Este es el paquete de lectura
//Ahora vamos a poner el nombre de la clase

/**
 * <h2>	Juego preguntas </h2>
 * En esta clase presentamos el juego preguntas, donde se realizar�n preguntas y se responder� con si o no
 * tras leer las respuestas todas juntas se motrar� un mensaje si has ganado o has perdido.
 * @author carlospc
 */
public class Preguntas {
	
	// Declaramos algunas variables
	public char res; // esta nos servir� para guardar la respuesta
	
		public void Preguntas1() {


		Scanner lector = new Scanner(System.in);
		System.out.println("�Crist�bal Col�n descubri� Am�rica?");
		res = lector.next().charAt(0); // Con esto leemos la respuesta
		
		
		
		if (res == 's') { // Verificamos que la respuesta sea si y pasamos a lo siguiente
			/**
			 * En este m�todo comprobamos si la respuesta es <b>correcta</b>.
			 * @author carlospc
			 */
			System.out.println("�Java es un lenguaje de programaci�n?");
		
			res = lector.next().charAt(0); // Con esto leemos la respuesta
			if (res == 's') {
				System.out.println("�Microsoft Word es un programa de pc?");
				
				/**
				 * En este m�todo comprobamos si la respuesta es <b>incorrecta</b>.
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

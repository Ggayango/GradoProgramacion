public class Main {
		
		 public static void main(String args[]){
			 
		/**
		* <p>Instanciamos el metodo de clase lanzar dados</p>
		* <p>El parametro miDados ejecuta el metodo recibir para ejecutar el programa</p>
		* @author Guille 
		*/			 
		LanzarDados miDados = new LanzarDados();
		System.out.println("Este programa simula el lanzamiento de dos dados.");		 
		miDados.recibir();
		 /**
		  * Instancia la clase "NumerosAleatorios"
		  * @author aaridom
		  */
		 NumerosAleatorios miNumero = new NumerosAleatorios();
		 
		 System.out.println("Este juego se trata de adivinar el numero aleatorio");
		 miNumero.aleatorio();
		 
			/**
			* <p>Instanciamos el metodo de clase Preguntas</p>
			* @author carlospc
			*/	
		 Preguntas miPregunta = new Preguntas();
		 System.out.println("Este juego se trata de adivinar unas preguntas sobre inform�tica");
		 miPregunta.Preguntas1();
		  
	}		 
} 
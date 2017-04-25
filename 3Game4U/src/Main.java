public class Main {
		
		 public static void main(String args[]){
			 
		LanzarDados miDados = new LanzarDados();
		  
		 System.out.println("Este programa simula el lanzamiento de dos dados.");
		 miDados.recibir();
		 
		 NumerosAleatorios miNumero = new NumerosAleatorios();
		 
		 System.out.println("Este juego se trata de adivinar el numero aleatorio");
		 miNumero.aleatorio();
	}		 
} 
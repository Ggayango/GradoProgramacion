import java.util.Scanner;

/**
 * Clase que se encargará de generar números aleatorios que el usuario tendrá que adivinar.
 * @author angad
 * @version <b>1.0</b>
 */
public class NumerosAleatorios {
	/**
	 * Lista de atributos incluyendo el Scanner
	 * @author angad 
	 */
	Scanner in = new Scanner(System.in);
	private int numero;
	private int valor;
	private int contador=0;
	private boolean ganar=false;
	
	/**
	 * <ul>
	 * 		<li><b>Método aleatorio</b></li>
	 * </ul>
	 * 
	 * Este método creo un número random del 1 al 100 y con un do while se irá repitiendo
	 * hasta que el usuario acierte el número en la consola.  
	 * @author angad
	 */
	public void aleatorio() {
		System.out.println("--------------------------------------");
		System.out.println("|         Bienvenido al juego        |");
		System.out.println("--------------------------------------");
		
		/**
		 * Generación de números aleatorios del 1 al 100
		 * @author angad
		 */
		numero=1+(int)(Math.random()*100);
		  System.out.println("En estos momentos se ha generado un numero comprendido entre-\n"+
		                     "1 y 100, que debes adivinar");
		  
		  System.out.println("--------------------------------------");
		  /**
		   * Bucle por el cual el usuario tendrá que poner los números para adivinar el correcto.
		   * @author angad
		   */
		   do{
		     contador++;
		     System.out.print("-Escribe el numero ");
		     valor = in.nextInt();
		     
		      if(valor==numero){
		       System.out.println("Felicidades, GANASTES con "+contador+" intentos");
		       
		       
		       
		       
		       ganar=true;
		       
		      }else{
		         String temp="";
		         if(numero>valor){
		          temp="mayor";
		          
		         }else{
		          temp="menor";
		         }
		        System.out.println("El numero que intentas adivinar es "+temp+" que "+valor);
		      }
		      
		   }while(contador<6 && ganar==false);
		   
		   if(ganar==false){
		    System.out.println("Lo siento, no has adivinado, el numero era el "+numero);
		   }
	}  
	  
}

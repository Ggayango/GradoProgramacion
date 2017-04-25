import java.util.Scanner;

public class NumerosAleatorios {
	
	Scanner in = new Scanner(System.in);
	int numero;
	int valor;
	int contador=0;
	boolean ganar=false;
	
	/**
	 * <ul>
	 * 		<li><b>Método aleatorio</b></li>
	 * </ul>
	 * 
	 * Este método creo un número random del 1 al 100 y con un do while se irá repitiendo
	 * hasta que el usuario acierte el número en la consola.  
	 * 
	 * @author aaridom
	 * @version <b>1.0</b>
	 */
	public void aleatorio() {
		System.out.println("--------------------------------------");
		System.out.println("|         Bienvenido al juego        |");
		System.out.println("--------------------------------------");
		
		numero=1+(int)(Math.random()*100);
		  System.out.println("En estos momentos se ha generado un numero comprendido entre-\n"+
		                     "1 y 100, que debes adivinar");
		  
		  System.out.println("--------------------------------------");
		  
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

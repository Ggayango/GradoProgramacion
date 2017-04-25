import java.util.Scanner;
import java.util.Random;

/**
 * <h2>Esto es el inicio de la clase Lanzar dados</h2>
 * <p>La clase lanzar dados lanza dos dados aleatoriamente</p>
 * @author Guille
 */
public class LanzarDados { // Abre clase LanzarDados
	/**
	 * <p>La variable <b>entrada</b> es creada para introducir una cantidad por teclado</p>
	 */
	Scanner entrada = new Scanner(System.in);
	/**
	 * <p>La variable <b>aleatorio</b> es creada para la generacion denumeros aleatorios</p>
	 */
	Random aleatorio = new Random();
	/**
	 * <p>La variable <b>numero</b> en ella se guardan los numeros aleatorios</p>
	 */
	private int numero;
	/**
	 * <p><b>arreglo</b> es el nombre asignado a una array</p>
	 */
	int arreglo[];
	
	/**
	 * <p>Este meodo se encarga de pedir el numero de veces que quieres<br>
	 * lanzar el dado y los añade a la array</p>
	 * 
	 * @author Guille
	 * @param numero se le asiga un numero por teclado
	 * @param arreglo crea un array de enteros a la que se asigan numeros
	 */
	public void recibir() { // Abre metodo Recibir
		System.out.print("\nPor favor introduzca el numero de veces que se lanzaran ");
		System.out.print(" los dados\n");
		numero = entrada.nextInt();
		arreglo = new int[numero];
		lanzar();
	} // cierra metodo Recibir
	
	/**
	 * <p>Este metodo se encarga de realizar el lanzamiento de los dados<br>
	 * mediante el metodo Random que creamos arriba</p>
	 * 
	 * @author Guille
	 * @param numero1 crea una variable
	 * @param numero2 crea una variable
	 */
	public void lanzar() { // Abre metodo Lanzar
		int numero1;
		int numero2;

		for (int i = 0; i < arreglo.length; i++) { // Abre for
			numero1 = 1 + aleatorio.nextInt(6);
			numero2 = 1 + aleatorio.nextInt(6);
			// System.out.printf("\n%d\t%d\n", numero1, numero2);
			// Descomentar para verificar que las sumas se capturan
			// de manera correcta. Para esto intruducir un numero
			// pequeño
			arreglo[i] = numero1 + numero2;
		} // Cierra for

		contar();
	} // Cierra metodo Lanzar
	
	/**
	 * <p>Este metodo se encarga de recorrer el array mostrando los<br>
	 * numeros resultantes del metodo Lanzar</p>
	 * 
	 * @author Guille
	 * @param contador crea un array de enteros
	 */

	public void contar() { // Abre metodo Contar
		int contador[] = new int[5];

		for (int j = 0; j < arreglo.length; j++) { // Abre for
			for (int k = 0; k < contador.length; k++) { // Abre for anidado
				if (arreglo[j] == k)
					contador[k]++;
			} // Cierra for anidado
		} // Cierra for

		imprimir(contador);

	} // Cierra metodo Contar
	
	/**
	 * <p>Este metodo Imprime el resultado dependiento de<br>
	 * la cantidad de veces que quiseramos lanzar el dado</p>
	 * 
	 * @author Guille
	 * @param B crea un array de enteros
	 */

	public void imprimir(int B[]) { // Abre metodo Imprimir
		for (int m = 0; m < B.length; m++) { // Abre for
			System.out.printf("\n%d lanzamientos sumaron %d\n", B[m], m);
		} // Cierra for
	} // Cierra metodo Imprimir

} // Cierra clase LanzarDdos
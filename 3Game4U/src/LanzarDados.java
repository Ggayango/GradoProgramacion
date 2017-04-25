import java.util.Scanner;
import java.util.Random;

public class LanzarDados { // Abre clase LanzarDados
	
	/**
	 * <h2>Esto es el inicio de la clase Lanzar dados</h2>
	 * <p>Aqui creamos una variable y una array llamada "Arreglo".</p>
	 * <p>Creamos los metodos Scaner el cual lee una entrada por teclado y<br> 
	 * el metodo Ramdom el cual genera numero aleatorios</p>
	 * 
	 */

	Scanner entrada = new Scanner(System.in);
	Random aleatorio = new Random();
	private int numero;
	int Arreglo[];
	
	/**
	 * <p>Este meodo se encarga de pedir el numero de veces que quieres<br>
	 * lanzar el dado y los añade a la array</p>
	 * 
	 */

	public void recibir() { // Abre metodo Recibir
		System.out.print("\nPor favor introduzca el numero de veces que se lanzaran ");
		System.out.print(" los dados\n");
		numero = entrada.nextInt();
		Arreglo = new int[numero];
		lanzar();
	} // cierra metodo Recibir
	
	/**
	 * <p>Este metodo se encarga de realizar el lanzamiento de los dados<br>
	 * mediante el metodo Random que creamos arriba</p>
	 * 
	 */

	public void lanzar() { // Abre metodo Lanzar
		int numero1;
		int numero2;

		for (int i = 0; i < Arreglo.length; i++) { // Abre for
			numero1 = 1 + aleatorio.nextInt(6);
			numero2 = 1 + aleatorio.nextInt(6);
			// System.out.printf("\n%d\t%d\n", numero1, numero2);
			// Descomentar para verificar que las sumas se capturan
			// de manera correcta. Para esto intruducir un numero
			// pequeño
			Arreglo[i] = numero1 + numero2;
		} // Cierra for

		contar();
	} // Cierra metodo Lanzar
	
	/**
	 * <p>Este metodo se encarga de recorrer el array mostrando los<br>
	 * numeros resultantes del metodo Lanzar</p>
	 * 
	 */

	public void contar() { // Abre metodo Contar
		int Contador[] = new int[13];

		for (int j = 0; j < Arreglo.length; j++) { // Abre for
			for (int k = 0; k < Contador.length; k++) { // Abre for anidado
				if (Arreglo[j] == k)
					Contador[k]++;
			} // Cierra for anidado
		} // Cierra for

		imprimir(Contador);

	} // Cierra metodo Contar
	
	/**
	 * <p>Este metodo Imprime el resultado dependiento de<br>
	 * la cantidad de veces que quiseramos lanzar el dado</p>
	 */

	public void imprimir(int B[]) { // Abre metodo Imprimir
		for (int m = 0; m < B.length; m++) { // Abre for
			System.out.printf("\n%d lanzamientos sumaron %d\n", B[m], m);
		} // Cierra for
	} // Cierra metodo Imprimir

} // Cierra clase LanzarDdos
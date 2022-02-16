/**
 * 
 * @author Nicolás Lascaux
 * @vertion 1.8
 * @title Ejercicio Capitulo 3
 */

package com.sopra.javabasico.capitulo3;
/**
 * Importamos la clase random para poder usar su clase y métodos
 */
import java.util.Random;


/**
 * 
 * Implementacion de la clase
 *
 */
public class Capitulo3 {
	//Variables estaticas de clase
	private static String str1;
	private static String str2 = "Esto es un String";
	
	/**
	 * Declaración de las variables de clase
	 */
	private int num;
	private float decimal;
	private Random random;
	

/**
 * Generar bloque inicializador	
 */
	{System.out.println("La variable num vale: " + num);}
/**
 * Generamos el constructor	
 * @param num
 * @param decimal
 * @param random
 */
	public Capitulo3(int num, float decimal, Random random) {
		int x = 10; //Variable a la que solo tiene acceso el constructor
		this.num = num;
		this.decimal = decimal;
		this.random = random;
	}


	/**
	 * Implementacion del metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Estoy aprendiendo a programar en Java\n");
		
		if(args.length != 0) //Evita que entre si no hay argumentos
		System.out.println("Me has mandado el texto: " + args[0]);
		
		/**
		 * Necesito importar Random para poder sacar un numero aleatorio, si la importo con el * me importará 
		 * todas las clases y me dirá que no las estoy usando
		 */ 
		Random r = new Random();
		System.out.println("Numero aleatorio del 0 al 9: " + r.nextInt(10));
		
		/**
		 * Creacion del objeto de clase capitulo3
		 */
		
		Capitulo3 cap3 = new Capitulo3(5, 1.5f, r);
		
		System.out.println(cap3.random.nextInt(6));
		
		/**
		 * Bloque inicializador del final de la clase
		 */
		{System.out.println("Este bloque es un inicializador de instancia");}
		
		//@Override
		//protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			//super.finalize();
		//}

	}
}

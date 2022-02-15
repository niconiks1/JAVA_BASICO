package com.prueba;

import java.util.Date;
//import java.util.Date; 
import java.util.Random; //Importa la clase util.Random

public class Prueba03 {
	
	private int contador = 1_000_000;
	private long contadorLong = 3L;
	private static int counter;
	
	{System.out.println("Inicialización de Prueba03");}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public static int getCounter() {
		return counter;
	}

	public Prueba03() {
		System.out.println("Creando objeto Prueba03");
		counter++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
//		java.util.Date d = new java.util.Date();
		Date d = new Date();
		System.out.println(r.nextInt(10));
	}

}

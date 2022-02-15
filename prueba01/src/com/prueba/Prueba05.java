package com.prueba;

import java.util.Date;

public class Prueba05 {
	
	int valor = 0;
	String valorS = null;
	
	public static void main(String[] args) {
		int valor = 5;
		Date d1 = new Date();
		Date d2 = d1;
		d1 = null;
		
		String saludo = "Hola";
		saludo = saludo.concat(d2.toString());
		
//		saludo = saludo + d1.toString();
//		saludo += d1.toString();
		System.out.println(saludo);
		
		Prueba05 p1 = new Prueba05();
		Prueba05 p2 = p1;
		
		p1.miFuncion(valor);
		System.out.println("Valor: " + valor);
		
		p1.miFuncion2(valor);
		System.out.println("Valor: " + valor);
		
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
	}
	
	public void miFuncion(int v) {
		v++;
		System.out.println("V: " + v);
	}
	
	public void miFuncion2(Integer v) {
		v++;
		System.out.println("V: " + v);
	}

}

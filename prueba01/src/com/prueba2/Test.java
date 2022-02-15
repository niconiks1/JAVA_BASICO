package com.prueba2;

import com.prueba.Prueba03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba03 p03 = new Prueba03();
		p03.setContador(3);
		System.out.println("Contador: " + p03.getContador());
		System.out.println("Counter: " + Prueba03.getCounter());
		Prueba03 p3 = new Prueba03();
		p3.setContador(10);
		System.out.println("Contador: " + p3.getContador());
		System.out.println("Counter: " + Prueba03.getCounter());
	}

}

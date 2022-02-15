package com.prueba2;

public class Calculadora {// Implementacion de patrón Singleton

	private static Calculadora instance;

	private Calculadora() {
		super();
	}

	public static Calculadora getInstance() { // Devuelve siempre la misma instancia del objeto
		if (instance == null) {
			instance = new Calculadora();
		}
		
		return instance;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Calculadora eliminada por el GC");
	}

}

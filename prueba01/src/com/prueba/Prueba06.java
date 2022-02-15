package com.prueba;

public class Prueba06 {

	private static int numeroClase = 0;
	private int numeroInstancia = 0;
	private String nombre;
	private Boolean amigable;
	final int NUM_CONSTANTE = 5;

	public static void main(String[] args) {
		String nombre1 = "Aitor", nombre2 = "Pepe";
		int i1, i2, i3, i4 = 0;

		int num; // Es el numero utilizado para contar las instancias de clase
		String valor;
		double d1, d2;

		int hola = 0;
		int holA;
		int numLados;

		System.out.println(hola);

		int x = 10;
		int y = x;

		int resultado = x + y;
		Prueba06 p = new Prueba06();

		System.out.println(p.devuelveNumeroInstancia(3));
		p.setNombre("Aitor");
		System.out.println(p.getNombre());
		p.findAnswer(null);

		p.comparacion("hola");
		
		System.gc();

	}

	public int devuelveNumeroInstancia(int _numeroInstancia) {
		this.numeroInstancia = _numeroInstancia;
		return this.numeroInstancia;
	}

	public void findAnswer(Boolean check) {
		int answer;
		int onlyOneBranch = 0;

		if (check == Boolean.TRUE) {
			answer = 1;
			onlyOneBranch = 1;
		} else {
			answer = 2;
		}

		System.out.println(answer);
		System.out.println(onlyOneBranch);

	}

	public void comparacion(String palabra) {
		String original = "hola";
		if (original.equals(palabra)) {
			String original2 = "pepe";
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
		System.out.println(original);
	}

	// ----BLOQUE DE GET-SET-------------------------

	public String getNombre() {
		return nombre;
	}

	public static int getNumeroClase() {
		return numeroClase;
	}

	public static void setNumeroClase(int numeroClase) {
		Prueba06.numeroClase = numeroClase;
	}

	public void setNombre(String nombre) {
		nombre += "1";
		this.nombre = nombre;
	}

	public boolean isAmigable() { // la regla con boolean para el getter es is no get
		return amigable;
	}

	public void setAmigable(boolean amigable) {
		this.amigable = amigable;
	}

}

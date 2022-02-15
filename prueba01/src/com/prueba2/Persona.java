package com.prueba2;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Persona() {
		
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Persona)) {
			return false;
		}
		Persona p = (Persona) obj;
		
		return (this.dni != null && p.getDni() != null) && (this.dni.equals(p.getDni())); 
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}


public class BusquedaOrdenada {

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 4, 6, 7, 9, 10 };
		int numBusqueda = 4;
		int flagIzq = 0;
		int flagDer = numeros.length - 1;
		int medio = 0;
		boolean encontrado = false;

		for (int i = 0; i < numeros.length && !encontrado; i++) {

			medio = (flagIzq + flagDer) / 2;
			if (numeros[medio] < numBusqueda) {
				flagIzq = medio + 1;
			} else {
				flagDer = medio - 1;
			}

			if (numeros[medio] == numBusqueda)
				encontrado = true;
		}
		if (encontrado) {
			System.out.println("El numero está dentro del array");
		} else {
			System.out.println("El numero NO está dentro del array");
		}
	}
}

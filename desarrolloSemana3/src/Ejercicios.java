import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicios {
	private Scanner scanner = new Scanner(System.in);;

	// Método para validar entrada de un número entero mayor que 0
	public int validarEntradaIntPositivo() {
		int numero;
		do {
			while (!scanner.hasNextInt()) {
				System.out.print("Entrada inválida. Ingrese un número entero: ");
				scanner.next();
			}
			numero = scanner.nextInt();
			if (numero <= 0) {
				System.out.print("El número debe ser mayor que 0. Intente nuevamente: ");
			}
		} while (numero <= 0);

		scanner.nextLine(); // Limpiar buffer
		return numero;
	}

	// Para validar número entero cualquiera (permite negativos)
	public int validarEntradaInt() {
		int numero;
		while (!scanner.hasNextInt()) {
			System.out.print("Entrada inválida. Ingrese un número entero: ");
			scanner.next();
		}
		numero = scanner.nextInt();
	
		scanner.nextLine(); // limpiar buffer
		return numero;
	}

	// Método para validar entrada de Strings (no vacío)
	public String validarEntradaString() {
		String texto;
		do {
			texto = scanner.nextLine().trim();
			if (texto.isEmpty()) {
				System.out.print("Entrada inválida. No puede estar vacío. Ingrese un texto: ");
			}
		} while (texto.isEmpty());
		return texto;
	}

	// Método para leer una lista de números enteros
	public ArrayList<Integer> hacerListaInt(int size) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			Integer newItem = validarEntradaInt();
			result.add(newItem);
		}

		return result;
	}

	// Método para leer una lista de strings
	public ArrayList<String> hacerListaString(int size) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			System.out.print("Palabra " + (i + 1) + ": ");
			result.add(validarEntradaString());
		}

		return result;
	}

	/**
	 * Ejercicio 1
	 */
	public void ejercicio1() {
		System.out.println("Ejercicio 1: Intersección de arreglos");

		System.out.println("Ingresa el tamaño de la primer lista:");

		int lengthList1 = validarEntradaIntPositivo();

		System.out.println("Ingresa el tamaño de la segunda lista:");

		int lengthList2 = validarEntradaIntPositivo();

		System.out.println("Ingresa los valores de la primera lista:");

		ArrayList<Integer> lista1 = hacerListaInt(lengthList1);

		System.out.println("Ingresa los valores de la segunda lista:");

		ArrayList<Integer> lista2 = hacerListaInt(lengthList2);

		ArrayList<Integer> intersection = new ArrayList<Integer>(lista1);

		intersection.retainAll(lista2);

		if (intersection.isEmpty()) {
			System.out.println("No hay intersección entre las dos listas.");
		} else {
			System.out.println("La intersección de los dos arrays es: " + intersection);
		}

	}

	/**
	 * Ejercicio 2
	 */
	public void ejercicio2() {
		System.out.println("Ejercicio 2: Segundo número más grande");
		System.out.println("Ingrese 10 números:");
		ArrayList<Integer> numeros = hacerListaInt(10);

		// Ordenar la lista en orden descendente
		Collections.sort(numeros);
		// Obtener el segundo numero mayor
		int segundoMayor = numeros.get(numeros.size() - 2);
		System.out.println("El segundo número más grande es: " + segundoMayor);
	}

	/**
	 * Ejercicio 3
	 * 
	 */
	public void ejercicio3() {
		System.out.println("Ejercicio 3: Cadena más larga");
		System.out.print("Ingrese la cantidad de palabras (debe ser mayor que 0): ");
		int size = validarEntradaIntPositivo();
		ArrayList<String> palabras = hacerListaString(size);
		// Encontrar la palabra más larga
		String palabraMasLarga = palabras.get(0);
		int indice = 0;

		for (int i = 1; i < palabras.size(); i++) {
			if (palabras.get(i).length() > palabraMasLarga.length()) {
				palabraMasLarga = palabras.get(i);
				indice = i;
			}
		}

		// Mostrar el resultado
		System.out.println("La palabra más larga es: \"" + palabraMasLarga + "\" en el índice " + indice);

	}

	public Integer menu() {
		System.out.println("\nSelecciona una opción:");
		System.out.println("1. Ejercicio 1");
		System.out.println("2. Ejercicio 2");
		System.out.println("3. Ejercicio 3");
		System.out.println("4. Cerrar programa");

		Integer option = scanner.nextInt();

		return option;
	}

	public void close() {
		this.scanner.close(); // Cerrar la instancia de scanner
		System.out.println("Programa terminado.");
	}

}

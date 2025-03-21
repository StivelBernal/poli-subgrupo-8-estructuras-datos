import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicios {
	
	public Ejercicios() {
        this.scanner = new Scanner(System.in);
    }
	 
	private Scanner scanner; 
	/**
	 * Ejercicio 1
	 * Desarrolle una solución que permita leer por consola 2 arreglos a=[], b=[] de números
		enteros y retorne la intersección de estos dos arreglos. La solución debe solicitar por
		consola el tamaño de ambos arreglos y debe permitir el ingreso de los valores para cada
		uno de ellos; la salida de este programa deberá mostrar la intersección de los 2 arreglos,
		si no existe intersección el programa debe indicarlo, tenga en cuenta que se debe validar
		los valores ingresados por el usuario.
	 */
	public void ejercicio1() {
		System.out.println("Ejercicio 1 instrucciones");

		System.out.println("Ingresa el tamaño de la primer lista");
		
		Integer lengthList1 = this.scanner.nextInt();

		System.out.println("Ingresa el tamaño de la segunda lista");
		
		Integer lengthList2 = this.scanner.nextInt();
		
		System.out.println("Ingresa los valores de la primera lista");
		
		ArrayList<Integer> lista1 = madeListEjercicio1(lengthList1);
		
		System.out.println("Ingresa los valores de la segunda lista");
		
		ArrayList<Integer> lista2 = madeListEjercicio1(lengthList2);
		
		ArrayList<Integer> intersection = new ArrayList<Integer>(lista1);
		    
		intersection.retainAll(lista2);
		
		System.out.println("La intercepción de los dos arrays es : " + intersection);
	    
		
	}
	
	public ArrayList<Integer> madeListEjercicio1 (int size) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			Integer newItem = this.scanner.nextInt();
			result.add(newItem);
		}
		
		return result;
	}
	/**
	 * Ejercicio 2
	 * Desarrolle una solución que lea un arreglo de 10 números enteros e identifique el
		segundo número más grande, La solución debe solicitar por consola el listado de los 10
		números, la salida de este programa debe mostrar el 2 número más grande del arreglo.
	 */
	public void ejercicio2() {
		System.out.println("Ejercicio 2");			
	}
	/**
	 * Ejercicio 3
	 * Desarrolle una solución que permita leer por consola un arreglo de Strings y que
		retorne la cadena más larga ingresada por el usuario, la solución debe solicitar al usuario
		el tamaño del arreglo y el ingreso de cada uno de los Strings, la salida de este programa
		debe indicar el índice de donde se encuentra el String más largo y la palabra.

	 */
	public void ejercicio3() {
		System.out.println("Ejercicio 3");	
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

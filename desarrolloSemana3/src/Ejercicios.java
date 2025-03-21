import java.util.Scanner;

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
		System.out.println("Ingrese el area");
					
	}
	
	public void ejercicio2() {
		System.out.println("Ejercicio 2");			
	}
	
	public void ejercicio3() {
		System.out.println("Ejercicio 3");	
	}
	
	public Integer menu() {
		System.out.println("\nSelecciona una opción:");
	    System.out.println("1. Ejercicio 1");
	    System.out.println("2. Ejercicio 2");
	    System.out.println("3. Ejercicio 3");
	    System.out.println("3. Ejercicio 4");
		
		
		Integer option = scanner.nextInt();
		
		return option;
	}
	
	public void close() {
		this.scanner.close(); // Cerrar la instancia de scanner
        System.out.println("Programa terminado.");
		
	}

}

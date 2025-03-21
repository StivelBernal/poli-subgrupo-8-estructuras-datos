package testexamen;

import java.util.Scanner;

public class main {

	/**
	 * Ejemplo area 3500 perimetro 240
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el area");
		
		double area = entrada.nextDouble();
		
		System.out.println("Ingrese el perimetro");

		double perimeter = entrada.nextDouble();
		
		double largo = 0, ancho = 0;
		
		ancho = (perimeter - Math.sqrt(perimeter * perimeter - 16 * area)) / 4;
		largo = (perimeter + Math.sqrt(perimeter * perimeter - 16 * area)) / 4;
		
		System.out.println("El terreno tiene dimensiones largo: " + largo + " por ancho: " + ancho);
				
		entrada.close();				
	}

}

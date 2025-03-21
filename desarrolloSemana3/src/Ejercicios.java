import java.util.Scanner;

public class Ejercicios {

	/**
	 * Ejercicio 1
	 */
	public void ejercicio1() {
		System.out.println("Ingrese el area");
		
		Scanner entrada = new Scanner(System.in);
	
		double area = entrada.nextDouble();
		
		System.out.println("Ingrese el perimetro");

		double perimeter = entrada.nextDouble();
		
		double largo = 0, ancho = 0;
		
		ancho = (perimeter - Math.sqrt(perimeter * perimeter - 16 * area)) / 4;
		largo = (perimeter + Math.sqrt(perimeter * perimeter - 16 * area)) / 4;
		
		System.out.println("El terreno tiene dimensiones largo: " + largo + " por ancho: " + ancho);
				
		entrada.close();				
	}
	
	public void ejercicio2() {
						
	}
	
	public void ejercicio3() {
		
	}

}

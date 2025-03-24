import java.util.Scanner;

/*
 * Politecnico Grancolombiano
 *
 * Facultad: Ingeniería Diseño e Innovación
 * Materia: ESTRUCTURAS DE DATOS
 *
 * Autores:
 *  1. ANDRES PORTILLO ARIAS
 *  2. BRAYAN STIVEL BERNAL GARCIA
 *  3. CARLOS CASTELLANOS CASAS
 *  4. JUAN ANGEL TORRES FLOREZ
 *  5. MATEO ECHEVERRI BETANCUR
 *
 * Entrega previa 1 - Escenario 3
 *
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();
		
		Integer action;
      

        // Bucle que se ejecuta hasta que el usuario elija salir (opción 4)
        do {
        	
        	action = ejercicios.menu();

            switch (action) {
                case 1:
            		ejercicios.ejercicio1();
                    break;
                case 2:
               		ejercicios.ejercicio2();
                    break;
                case 3:
                	ejercicios.ejercicio3();
                    break;
                case 4:
                	ejercicios.close();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (action != 4); // El bucle continúa mientras la opción no sea 4
       
	
	}

	
}

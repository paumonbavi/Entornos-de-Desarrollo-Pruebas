package entornosDeDesarrollo;

	/**
	 * Programa que analiza un conjunto de números para obtener
	 * el valor mayor y cuantas veces se repite.
	 */

public class Y {

	/**
	 * Punto de entrada del programa.
	 * Recorre un array de números.
	 */
	
	public static void main(String[] args) {
		
		int[] d = {4, 7, 2, 9, 2, 5}; // // Array que almacena 6 números.
        int e = 0; // Contador
        int f = d[0]; // Auxiliar

        for (int i = 1; i < d.length; i++) { // Bucle para sacar el número más alto.
            if (d[i] > f) { 
                f = d[i]; 
            } 
        } 

        for (int i = 0; i < d.length; i++) { // Bucle para contar cuantas veces sale un número.
            if (d[i] == f) { 
                e++; 
            } 
        } 
        
        System.out.println(f + ":" + e); // Para mostrar los resultados

    } 
		
}



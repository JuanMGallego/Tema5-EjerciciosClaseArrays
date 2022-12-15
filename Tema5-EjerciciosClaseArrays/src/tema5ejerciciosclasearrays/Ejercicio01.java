package tema5ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int size;
		int def;
		int array[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intoduzca el tamaño del array: ");
		size = sc.nextInt();
		System.out.println();
		
		System.out.print("Introduzca el valor entero por defecto del array: ");
		def = sc.nextInt();
		System.out.println();
		
		array = new int[size];
		
		Arrays.fill(array, def);
		
		System.out.println(Arrays.toString(array));
		
		sc.close();

	}

}

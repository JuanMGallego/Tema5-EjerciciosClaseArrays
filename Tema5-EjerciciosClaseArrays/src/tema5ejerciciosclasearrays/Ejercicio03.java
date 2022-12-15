package tema5ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 20 números enteros: ");
		
		for (int i = 0 ; i < 20 ; i++) {
			
			if (i < 10) {
				
				array1[i] = sc.nextInt();
				
			} else {
				
				array2[i - array1.length] = sc.nextInt();
				
			}
			
		}
		
		System.out.println();
		System.out.println("¿Son iguales los primeros 10 números y los 10 últimos?: " + Arrays.equals(array1, array2));
		
		sc.close();

	}

}

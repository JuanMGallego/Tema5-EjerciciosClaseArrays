package tema5ejerciciosclasearrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int search;
		int cuant = 0;
		boolean exists = false;
		
		int nums[] = new int[1000];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = (int) (Math.random()*100);
			
		}
		
		System.out.print("Introduzca un valor entre 0 y 99 para buscarlo en la tabla: ");
		search = sc.nextInt();
		System.out.println();
		
		if (search < 0 || search > 99) {
			
			System.out.println("ERROR: Has introducido un valor fuera de rango");
			
		} else {
		
			for (int i = 0 ; i < nums.length ; i++) {
				
				if (nums[i] == search) {
					
					exists = true;
					
					cuant++;
					
				}
				
			}
			
			if (exists == false) {
				
				System.out.println("No existe ese número dentro de la tabla");
				
			} else if (cuant == 1) {
				
				System.out.println("El número existe dentro de la tabla y se repite 1 vez");
				
			} else {
				
				System.out.println("El número existe dentro de la tabla y se repite " + cuant + " veces");
				
			}
			
		}
		
		sc.close();

	}

}

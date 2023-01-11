package tema5ejerciciosclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int ranking[] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la puntuación de los 8 jugadores:");
		
		for (int i = 0 ; i < ranking.length ; i++) {
			
			ranking[i] = sc.nextInt();
			
		}
		
		Arrays.sort(ranking);
		
		System.out.println();
		System.out.println("Ranking de mayor puntuación a menor: ");
		System.out.println();
		
		for (int i = ranking.length - 1 ; i >= 0 ; i--) {
			
			System.out.println(ranking[i]);
			
		}
		
		sc.close();

	}

}

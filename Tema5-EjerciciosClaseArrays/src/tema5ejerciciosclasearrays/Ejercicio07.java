package tema5ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int ticket[] = new int[6];
		int winner[] = new int[6];
		int hits = 0;
		
		for (int i = 0 ; i < ticket.length ; i++) {
			
			ticket[i] = (int) (Math.random()*49) + 1;
			
			winner[i] = (int) (Math.random()*49) + 1;
			
		}
		
		System.out.println("Boleto usuario: " + Arrays.toString(ticket));
		
		Arrays.sort(winner);
		
		System.out.println("Boleto ganador: " + Arrays.toString(winner));
		System.out.println();
		
		for (int i = 0 ; i < ticket.length ; i++) {
			
			int pos = Arrays.binarySearch(winner, ticket[i]);
			if (pos >= 0) {
				
				hits++;
				
			}
		
		}
		
		System.out.println("Has acertado " + hits + " números");

	}

}

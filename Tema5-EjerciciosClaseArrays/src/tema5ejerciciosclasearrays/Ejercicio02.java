package tema5ejerciciosclasearrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int desde = 0;
		final int LASTNUM = 10;
		
		int array[] = new int[55];
		
		for (int i = 1 ; i <= LASTNUM ; i++) {
			
			Arrays.fill(array, desde, desde + i, i);
			
			desde += i;
			
		}
		
		System.out.println(Arrays.toString(array));

	}

}

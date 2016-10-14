package de.mmunce.prog2.uebung1.test;

import java.util.Arrays;

import de.mmunce.prog2.uebung1.Arrayelement;

public class ArrayelementTest {

	public static void main(String[] args) {
		byte[] arr = new byte[]{1, 1 , 3, 4, 2, -10, -10, 5, 6, 8 ,9, 10, 1, -10, 2};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		byte[] result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));
	}

}

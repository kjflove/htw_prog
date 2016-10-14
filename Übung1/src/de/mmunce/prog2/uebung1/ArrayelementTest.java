package de.mmunce.prog2.uebung1;

import java.util.Arrays;
import java.util.Random;

public class ArrayelementTest {

	public static void main(String[] args) {
		byte[] arr = new byte[50];
		new Random().nextBytes(arr);
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		byte result = Arrayelement.haeufigstesElem(arr);
		System.out.println(result);
	}

}

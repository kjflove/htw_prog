package de.mmunce.prog2.uebung3.test;

import de.mmunce.prog2.uebung3.Binary;

public class TestBinary {

	private static final String FORMAT = "%s : %5d";
	
	public static void main(String[] args) {
		// Ausgeben aller zweier Potenzen
		for(int i = 1; i <= 65536; i = i << 1) {
			print(i);
		}
		
		System.out.println("-------------------------------------------------");
		print(255);
		print(65535);
		print(Integer.MAX_VALUE);
		print(Integer.MIN_VALUE);
	}
	
	private static void print(int integer) {
		System.out.println(String.format(FORMAT, Binary.inBinary(integer, true), integer));
	}

}

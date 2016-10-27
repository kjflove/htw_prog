package de.mmunce.prog2.uebung3.test;

import de.mmunce.prog2.uebung3.Binary;
import de.mmunce.prog2.uebung3.BitFlags;

public class TestBitFlags {

	public static void main(String[] args) {
		BitFlags bf = new BitFlags(0);
		System.out.println(Binary.inBinary(bf.getStatus()));
		bf.switchOn(3);
		bf.switchOn(2);
		bf.switchOn(1);
		bf.switchOn(0);
		System.out.println(Binary.inBinary(bf.getStatus()));
		bf.switchOff(2);
		bf.switchOff(0);
	}
}

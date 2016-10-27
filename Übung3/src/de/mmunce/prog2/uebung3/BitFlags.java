package de.mmunce.prog2.uebung3;

public class BitFlags {

	private int status;
	
	public BitFlags(int status) {
		this.status = status;
	}
	
	/**
	 * Setzt Bit an gegebenen Index auf 1.
	 * @param index
	 */
	public void switchOn(int index) {
		this.status = status | (1 << index);
	}
	
	/**
	 * Setzt ein Bit an gegebenen Index auf 0
	 * @param index
	 */
	public void switchOff(int index) {
		this.status = status & (~(1 << index));
	}

	/**
	 * Dreht Bit an gegebenen Index um
	 * @param index
	 */
	public void swap(int index) {
		this.status = status ^ (1 << index);
	}
	
	/**
	 * Gibt zurück, ob Bit an gegebenen Index gesetzt ist
	 * @param index
	 * @return <code>true</code> wenn Bit gesetzt.
	 */
	public boolean isSet(int index) {
		return ((this.status >>> index) & 1) == 1;
	}
	
	public int getStatus() {
		return status;
	}
} 
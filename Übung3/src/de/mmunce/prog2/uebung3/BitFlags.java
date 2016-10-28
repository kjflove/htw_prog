package de.mmunce.prog2.uebung3;

public class BitFlags {

	private int status;
	
	public BitFlags(int status) {
		this.status = status;
	}
	
	/**
	 * Setzt Bit an gegebenen Index auf 1.
	 * @param index
	 * @throws IllegalArgumentException wenn nicht gilt 0 <= index < 32
	 */
	public void switchOn(int index) throws IllegalArgumentException {
		this.checkInterval(index);
		this.status = status | (1 << index);
	}
	
	/**
	 * Setzt ein Bit an gegebenen Index auf 0
	 * @param index
	 * @throws IllegalArgumentException wenn nicht gilt 0 <= index < 32
	 */
	public void switchOff(int index) throws IllegalArgumentException {
		this.status = status & (~(1 << index));
	}

	/**
	 * Dreht Bit an gegebenen Index um
	 * @param index
	 * @throws IllegalArgumentException wenn nicht gilt 0 <= index < 32
	 */
	public void swap(int index) throws IllegalArgumentException {
		this.status = status ^ (1 << index);
	}
	
	/**
	 * Gibt zur¸ck, ob Bit an gegebenen Index gesetzt ist
	 * @param index
	 * @return <code>true</code> wenn Bit gesetzt.
	 * @throws IllegalArgumentException wenn nicht gilt 0 <= index < 32
	 */
	public boolean isSet(int index) throws IllegalArgumentException {
		return ((this.status >>> index) & 1) == 1;
	}
	
	public int getStatus() {
		return status;
	}
	
	///////////////////////////////////////////////////
	
	private void checkInterval(int index) throws IllegalArgumentException {
		if(index < 0 || index > 31) {
			throw new IllegalArgumentException("Index auﬂerhalb des Intervalls [0; 32[");
		}
	}
} 
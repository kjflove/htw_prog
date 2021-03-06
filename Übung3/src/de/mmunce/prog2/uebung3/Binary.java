package de.mmunce.prog2.uebung3;

public class Binary {

	/**
	 * Wandelt eine Integerzahl in ihre 32-bit Binärdarstellung um
	 * @param number Eingabezahl
	 * @param spacePadded wenn <code>true</code> wird jedes Byte durch ein Leerzeichen getrennt
	 * @return Binärdarstellung als String
	 */
	public static String inBinary(int number, boolean spacePadded) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 32; i++) {
			// Jedes einzelne Bit von links nach rechts durchgehen und an den Ergebnisstring anhängen
			sb.append((number >>> 31 - i) & 1);
			// Wenn gewünscht alle 8 Bit ein Leerzeichen einfügen 
			if(spacePadded && ((i + 1) % 8 == 0)) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	/**
	 * Wandelt eine Integerzahl in ihre 32-bit Binärdarstellung um.
	 * @param number Eingabezahl
	 * @return Binärdarstellung als String
	 */
	public static String inBinary(int number) {
		return inBinary(number, false); 
	}

}
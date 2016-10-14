package de.mmunce.prog2.uebung1;

import java.util.Arrays;

public class Arrayelement {

	public static byte haeufigstesElem(byte[] arr) {
		
		// Array sortieren, damit inkrementell gesucht/gez�hlt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element
		byte temp = arr[0];
		// Startzustand: Das erste Element im Array ist das h�ufigste
		byte max = arr[0];
		// Aktueller Z�hler
		int tmpCount = 1;
		// Gesamtz�hler
		int maxCount = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == temp) {
				// Aufeinanderfolgende gleiche Werte
				tmpCount++;
			} else {
				// Unterschiedlicher Wert
				if(tmpCount > maxCount) {
					// Z�hler am h�chsten, dann max Z�hler und Element aktualisieren
					max = arr[i-1];
					maxCount = tmpCount;
				}
				
				temp = arr[i];
				tmpCount = 1;
			}
		}
		
		// Wenn aktueller Z�hler gr��er als max, gib letztes Element zur�ck (Weil sortiert!)
		// Ansonsten das zwischengespeicherte Element
		return tmpCount > maxCount ? arr[arr.length - 1] : max;
	}
}

package de.mmunce.prog2.uebung1;

import java.util.Arrays;

public class Arrayelement {

	public static byte haeufigstesElem(byte[] arr) {
		
		// Array sortieren, damit inkrementell gesucht/gezählt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element
		byte temp = arr[0];
		// Startzustand: Das erste Element im Array ist das häufigste
		byte max = arr[0];
		// Aktueller Zähler
		int tmpCount = 1;
		// Gesamtzähler
		int maxCount = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == temp) {
				// Aufeinanderfolgende gleiche Werte
				tmpCount++;
			} else {
				// Unterschiedlicher Wert
				if(tmpCount > maxCount) {
					// Zähler am höchsten, dann max Zähler und Element aktualisieren
					max = arr[i-1];
					maxCount = tmpCount;
				}
				
				temp = arr[i];
				tmpCount = 1;
			}
		}
		
		// Wenn aktueller Zähler größer als max, gib letztes Element zurück (Weil sortiert!)
		// Ansonsten das zwischengespeicherte Element
		return tmpCount > maxCount ? arr[arr.length - 1] : max;
	}
}

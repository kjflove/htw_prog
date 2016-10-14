package de.mmunce.prog2.uebung1;

import java.util.Arrays;

public class Arrayelement {

	/**
	 * Gibt die häufigsten Elemente in einem Array aus bytes zurück. <br>
	 * Wenn mehrere Elemente gleich oft vorkommen, enthält das Ergebnisarray mehrere Elemente;
	 * @param arr zu durchsuchendes Array
	 * @return array mit häufigsten Elementen
	 */
	public static byte[] haeufigstesElem(byte[] arr) {
		
		// Array sortieren, damit inkrementell gesucht/gezählt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element (= erstes Element im sortierten Array; = Element mit niedrigstem Wert)
		// "Pointer"
		byte temp = arr[0];
		// Startzustand: Annahme: Das erste Element im Array ist das häufigste
		byte[] max = {arr[0]};
		// Zähler für das aktuelle Element
		int tmpCount = 1;
		// Zähler für das insgesamt am häufigsten vorkommende Element
		int maxCount = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == temp) {
				// Gleiche Werte im array folgen aufeinander (Da sortiert)
				tmpCount++;
			} else {
				// Ein unterschiedlicher Wert folgt
				if(tmpCount > maxCount) {
					// Zuletzt gezähltes Element kommt (bisher) am häufigsten vor 
					// -> Zähler und max Element aktualisieren 
					max = new byte[]{arr[i-1]};
					maxCount = tmpCount;
				} else if(tmpCount == maxCount) {
					// Zuletzt gezähltes Element kommt genau so häufig wie die bisher häufigsten vor
					// -> Alle Elemente als häufigstes speichern
					byte[] tmp = new byte[max.length + 1];
					for(int j = 0; j < max.length; j++) {	// Kopieren des alten max Arrays in größeres Array
						tmp[j] = max[j];
					}
					tmp[tmp.length - 1] = arr[i-1];	// Zuletzt gezählstes Element hinzufügen
					max = tmp;
				}
				
				temp = arr[i];	// Pointer aktualisieren
				tmpCount = 1;	// Zähler zurücksetzen
			}
		}
		
		// Wenn aktueller Zähler größer als max, gib zuletzt gezähltess Element zurück (Weil sortiert!)
		// Ansonsten die zwischengespeicherten Elemente
		if(tmpCount > maxCount) {
			return new byte[]{arr[arr.length - 1]};
		} else {
			return max;
		}
	}
}

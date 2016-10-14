package de.mmunce.prog2.uebung1;

import java.util.Arrays;

public class Arrayelement {

	/**
	 * Gibt die h�ufigsten Elemente in einem Array aus bytes zur�ck. <br>
	 * Wenn mehrere Elemente gleich oft vorkommen, enth�lt das Ergebnisarray mehrere Elemente;
	 * @param arr zu durchsuchendes Array
	 * @return array mit h�ufigsten Elementen
	 */
	public static byte[] haeufigstesElem(byte[] arr) {

		// Array sortieren, damit inkrementell gesucht/gez�hlt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element (= erstes Element im sortierten Array; = Element mit niedrigstem Wert)
		// "Pointer"
		byte temp = arr[0];
		// Startzustand: Annahme: Das erste Element im Array ist das h�ufigste
		byte[] max = {arr[0]};
		// Z�hler f�r das aktuelle Element
		int tmpCount = 1;
		// Z�hler f�r das insgesamt am h�ufigsten vorkommende Element
		int maxCount = 1;

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == temp) {
				// Gleiche Werte im array folgen aufeinander (Da sortiert)
				tmpCount++;
			} else {
				// Ein unterschiedlicher Wert folgt
				if(tmpCount > maxCount) {
					// Zuletzt gez�hltes Element kommt (bisher) am h�ufigsten vor 
					// -> Z�hler und max Element aktualisieren 
					max = new byte[]{arr[i-1]};
					maxCount = tmpCount;
				} else if(tmpCount == maxCount) {
					// Zuletzt gez�hltes Element kommt genau so h�ufig wie die bisher h�ufigsten vor
					// -> Alle Elemente als h�ufigstes speichern
					max = addToArray(max, arr[i - 1]);
				}

				temp = arr[i];	// Pointer aktualisieren
				tmpCount = 1;	// Z�hler zur�cksetzen
			}
		}

		// Wenn aktueller Z�hler gr��er als max, gib zuletzt gez�hltess Element zur�ck (Weil sortiert!)
		// Ansonsten die zwischengespeicherten Elemente
		if(tmpCount > maxCount) {
			return new byte[]{arr[arr.length - 1]};
		} else {
			return max;
		}
	}

	/**
	 * F�gt ein byte einem byte array hinzu.<br>
	 * R�ckgabe ist ein neues Array mit der alten Gr��e + 1
	 * @param old altes Array
	 * @param toAdd Wert der hinzugef�gt werden soll
	 * @return neues Array
	 */
	private static byte[] addToArray(byte[] old, byte toAdd) {
		byte[] tmp = new byte[old.length + 1];
		for(int j = 0; j < old.length; j++) {	// Kopieren des alten Arrays in gr��eres Array
			tmp[j] = old[j];
		}
		tmp[tmp.length - 1] = toAdd;	// Element hinzuf�gen
		return tmp;
	}
}

package de.mmunce.prog2.uebung1;

import java.util.Arrays;

/**
 * Klasse f�r Utilitymethode zum Z�hlen von Arrayelementen
 * @author Marcel Munce - s0555992
 *
 */
public class Arrayelement {

	/**
	 * Gibt die h�ufigsten Elemente in einem Array aus bytes zur�ck. <br>
	 * Wenn mehrere Elemente gleich oft vorkommen, enth�lt das Ergebnisarray mehrere Elemente.<br>
	 * Sofern das �bergebene Array leer ist, ist auch das Ergebnisarray leer.
	 * @param arr zu durchsuchendes Array
	 * @return array mit h�ufigsten Elementen
	 */
	public static byte[] haeufigstesElem(byte[] arr) {

		// Die am h�ufigsten vorkommenden Elemente
		byte[] max = new byte[0];
		
		// Leeres Eingabearray
		if(arr.length == 0) {
			System.err.println("Leeres Eingabearray");
			return max;
		}

		// Array sortieren, damit inkrementell gesucht/gez�hlt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element (= erstes Element im sortierten Array; = Element mit niedrigstem Wert)
		// "Pointer"
		byte temp = arr[0];
		// Z�hler f�r das aktuelle Element
		int tmpCount = 1;
		// Z�hler f�r das insgesamt am h�ufigsten vorkommende Element
		int maxCount = 0;

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
					max = Arrayelement.addToArray(max, arr[i - 1]);
				}

				temp = arr[i];	// Pointer aktualisieren
				tmpCount = 1;	// Z�hler zur�cksetzen
			}
		}

		/* 
		 * Grenzfall! Wenn das gr��te Element (nach Sortieren also am Ende des Arrays) am h�ufigsten vorkommt,
		 * wird nur der erste if-Block in der Schleife durchlaufen, also der tmpCount aktualisiert.
		 * Am Ende ist also noch mal zu pr�fen, ob der tmpCount gr��er als der/gleich dem maxCount ist.
		 * 
		 */
		if(tmpCount > maxCount) {
			max = new byte[]{arr[arr.length - 1]};
		} else if(tmpCount == maxCount) {
			max =  Arrayelement.addToArray(max, temp);
		}
		return max;
	}
	

	/**
	 * F�gt ein byte einem byte array hinzu.<br>
	 * R�ckgabe ist ein neues Array mit der alten Gr��e + 1
	 * @param old altes Array
	 * @param toAdd Wert der hinzugef�gt werden soll
	 * @return neues Array
	 */
	public static byte[] addToArray(byte[] old, byte toAdd) {
		byte[] tmp = new byte[old.length + 1];
		for(int j = 0; j < old.length; j++) {	// Kopieren des alten Arrays in gr��eres Array
			tmp[j] = old[j];
		}
		tmp[tmp.length - 1] = toAdd;	// Element hinzuf�gen
		return tmp;
	}
}

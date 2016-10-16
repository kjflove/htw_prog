package de.mmunce.prog2.uebung1;

import java.util.Arrays;

/**
 * Klasse für Utilitymethode zum Zählen von Arrayelementen
 * @author Marcel Munce - s0555992
 *
 */
public class Arrayelement {

	/**
	 * Gibt die häufigsten Elemente in einem Array aus bytes zurück. <br>
	 * Wenn mehrere Elemente gleich oft vorkommen, enthält das Ergebnisarray mehrere Elemente.<br>
	 * Sofern das übergebene Array leer ist, ist auch das Ergebnisarray leer.
	 * @param arr zu durchsuchendes Array
	 * @return array mit häufigsten Elementen
	 */
	public static byte[] haeufigstesElem(byte[] arr) {

		// Die am häufigsten vorkommenden Elemente
		byte[] max = new byte[0];
		
		// Leeres Eingabearray
		if(arr.length == 0) {
			System.err.println("Leeres Eingabearray");
			return max;
		}

		// Array sortieren, damit inkrementell gesucht/gezählt werden kann
		Arrays.sort(arr);

		// Aktuell untersuchtes Element (= erstes Element im sortierten Array; = Element mit niedrigstem Wert)
		// "Pointer"
		byte temp = arr[0];
		// Zähler für das aktuelle Element
		int tmpCount = 1;
		// Zähler für das insgesamt am häufigsten vorkommende Element
		int maxCount = 0;

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
					max = Arrayelement.addToArray(max, arr[i - 1]);
				}

				temp = arr[i];	// Pointer aktualisieren
				tmpCount = 1;	// Zähler zurücksetzen
			}
		}

		/* 
		 * Grenzfall! Wenn das größte Element (nach Sortieren also am Ende des Arrays) am häufigsten vorkommt,
		 * wird nur der erste if-Block in der Schleife durchlaufen, also der tmpCount aktualisiert.
		 * Am Ende ist also noch mal zu prüfen, ob der tmpCount größer als der/gleich dem maxCount ist.
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
	 * Fügt ein byte einem byte array hinzu.<br>
	 * Rückgabe ist ein neues Array mit der alten Größe + 1
	 * @param old altes Array
	 * @param toAdd Wert der hinzugefügt werden soll
	 * @return neues Array
	 */
	public static byte[] addToArray(byte[] old, byte toAdd) {
		byte[] tmp = new byte[old.length + 1];
		for(int j = 0; j < old.length; j++) {	// Kopieren des alten Arrays in größeres Array
			tmp[j] = old[j];
		}
		tmp[tmp.length - 1] = toAdd;	// Element hinzufügen
		return tmp;
	}
}

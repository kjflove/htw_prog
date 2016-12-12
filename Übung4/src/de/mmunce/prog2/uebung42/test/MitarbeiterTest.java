package de.mmunce.prog2.uebung42.test;

import de.mmunce.prog2.uebung42.Auszubildender;
import de.mmunce.prog2.uebung42.Mitarbeiter;

/**
 * Testen der Klasse Mitarbeiter und Auszubildender
 * @author Marcel Munce - s0555992
 *
 */
public class MitarbeiterTest
{

	public static void main(String[] args)
	{
		// Mitarbeiter und Azubis erzeugen
		Mitarbeiter m1 = new Mitarbeiter("Walser", "Frank", 1600.0);
		Mitarbeiter m2 = new Mitarbeiter("Flink", "Eva", 1650.0);
		Mitarbeiter m3 = new Mitarbeiter("Boss", "Hanns", 4000.0);
		Auszubildender a1 = new Auszubildender("Vogel", "Sven", 450.0);
		Auszubildender a2 = new Auszubildender("Meier", "Dennis", 450.0);
		
		//Gehalt erhöhen
		m1.gehaltErhoehen(150d);
		// Getter und Setter für Namen
		m2.setName(m2.getName() + "-Schuster");
		m3.setVorname("Hans");
		
		// Azubi setter
		a1.setBezeichnung("Einzelhandelskaufmann");
		a1.setLehrjahr(2);
		a1.setGehalt(520);
		// Azubi Setter und Getter
		a2.setBezeichnung(a1.getBezeichnung());
		a2.setGehalt(a1.getGehalt());
		a2.setLehrjahr(a1.getLehrjahr());
		
		// Ungültiger Parameter
		m2.gehaltErhoehen(-300);
		
		// Ausgabe
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}

package de.mmunce.prog2.uebung1;

import java.util.Arrays;

/**
 * Klasse für Vektoren
 * 
 * @author Marcel Munce
 */
public class Vektor {
    
    private int dimension;
    private float[] komponenten;
    private boolean istZeilenvektor = true;
    
    /**
     * Erstellt einen Vektor mit den gegebenen Komponenten.
     * @param komponenten Komponenten des Vektors
     * @param istZeilenvektor gibt an, ob es sich um einen Zeilenvektor handelt (<code>false</code> entspricht Spaltenvektor)
     */
    public Vektor(float[] komponenten, boolean istZeilenvektor) {
        dimension = komponenten.length;
        this.komponenten = komponenten;
        this.istZeilenvektor = istZeilenvektor;
    }
    
    /**
     * Instanz von Vektor mit {@link Vektor#istZeilenvektor} standardmäßig auf
     * <code>true</code>.
     * @param komponenten 
     */
    public Vektor(float[] komponenten) {
        this(komponenten, true);
    }
    
    /**
	 * @return Dimension des Vektors
	 */
	public int getDimension() {
		return dimension;
	}

	/**
	 * @return Array der Komponenten
	 */
	public float[] getKomponenten() {
		return komponenten;
	}

	/**
     * @return <code>true</code> wenn es sich um einen Zeilenvektor handelt, ansonsten <code>false</code>.
     */
    public boolean istZeilenvektor() {
    	return istZeilenvektor;
    }
    
    /**
     * Transponiert den Vektor
     */
    public void transponiere() {
        /*
         * Ein Vektor wird transponiert, indem die Zeilen- und Spaltenindizes der Komponenten getauscht werden.
         * Da ein Vektor die Dimension 1 * n hat, reicht es aus, das Attribut istZeilenvektor umzukehren
         */
    	istZeilenvektor = !istZeilenvektor;
    }
    
    /**
     * Berechnet das SkalarProdukt mit einem zweiten Vektor.<br>
     * Vorausgesetzt für die Berechnung ist, dass die Vektoren die selbe Dimension haben.
     * @param vektorB zweiter Vektor zur Berechnung
     * @return Skalarprodukt
     * @throws IllegalArgumentException wenn Dimensionen unterschiedlich sind
     */
    public float skalarProdukt(Vektor vektorB) throws IllegalArgumentException {
        if(this.getDimension() != vektorB.getDimension()) {
        	throw new IllegalArgumentException(
        			String.format("Vektor hat abweichende Dimension (ist: %d, muss: %d)", vektorB.getDimension(), this.getDimension())
    			);
        }
        
        float produkt = 0f;
        
        for(int i = 0; i < this.getDimension(); i++) {
        	produkt += komponenten[i] * vektorB.getKomponenten()[i];
        }
        
    	return produkt;
    }

	@Override
	public String toString() {
		// Vektor wird immer als Zeilenvektor (a, b, c,...) ausgegeben.
		// Handelt es sich allerdings um einen Spaltenvektor, kennzeichnet ^T, dass es sich um die Transponierte Darstellung handelt.
		return String.format("Vektor%s%s", Arrays.toString(komponenten), istZeilenvektor ? "" : "^T");
	}
}


package de.mmunce.prog2.uebung42;

/**
 * Klasse zur Abbildung von Daten eines Auszubildenden
 * 
 * @author Marcel Munce - s0555992
 *
 */
public class Auszubildender extends Mitarbeiter
{
	private String bezeichnung;
	private int lehrjahr;
	
	/**
	 * Erstellt einen Auszubildenden. <br>
	 * Lehrjahr standardmäßig auf 1
	 * @param name
	 * @param vorname
	 * @param gehalt
	 */
	public Auszubildender(String name, String vorname, double gehalt)
	{
		super(name, vorname, gehalt);
		this.lehrjahr = 1;
	}
	
	/**
	 * @return Bezeichnung des Ausbildungsberufs
	 */
	public String getBezeichnung()
	{
		return bezeichnung;
	}

	/**
	 * Setzt Bezeichnung der Ausbildung
	 * @param bezeichnung
	 */
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	/**
	 * @return Lehrjahr des Auszubildenden
	 */
	public int getLehrjahr()
	{
		return lehrjahr;
	}

	/**
	 * Setzt das Lehrjahr. Lehrjahr >= 1
	 * @param lehrjahr
	 */
	public void setLehrjahr(int lehrjahr)
	{
		if(lehrjahr >= 1)
		{
			this.lehrjahr = lehrjahr;
		}
	}

	@Override
	public String toString()
	{
		return "Auszubildener [name=" + getName() + ", vorname=" + getVorname() + ", gehalt=" + getGehalt()
				+ ", bezeichung=" + bezeichnung + ", lehrjahr=" + lehrjahr + "]";
	}
}

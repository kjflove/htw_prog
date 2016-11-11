package de.mmunce.prog2.uebung42;

/**
 * Klasse zur Abbildung von Mitarbeiterdaten
 * @author Marcel Munce - s0555992
 *
 */
public class Mitarbeiter
{
	private String name;
	private String vorname;
	private double gehalt;

	/**
	 * Erstellt einen neuen Mitarbeiter
	 * @param name
	 * @param vorname
	 * @param gehalt
	 */
	public Mitarbeiter(String name, String vorname, double gehalt)
	{
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	/**
	 * Erhöht das Gehalt um einen Betrag > 0
	 * @param erhoehung
	 */
	public void gehaltErhoehen(double erhoehung) {
		if(erhoehung > 0)
		{
			this.setGehalt(getGehalt() + erhoehung);
		}
	}

	/**
	 * @return Nachname des Mitarbeiters
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Setzt den Nachnamen
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return Vorname des Mitarbeiters
	 */
	public String getVorname()
	{
		return vorname;
	}

	/**
	 * Setzt den Vornamen
	 * @param vorname
	 */
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	/**
	 * @return Gehalt des Mitarbeiters
	 */
	public double getGehalt()
	{
		return gehalt;
	}

	/**
	 * Setzt das Gehalt. Gehalt muss >= 0 sein.
	 * @param gehalt
	 */
	public void setGehalt(double gehalt)
	{
		if(gehalt >= 0)
		{
			this.gehalt = gehalt;
		}
	}

	@Override
	public String toString()
	{
		return "Mitarbeiter [name=" + name + ", vorname=" + vorname + ", gehalt=" + gehalt + "]";
	}
}

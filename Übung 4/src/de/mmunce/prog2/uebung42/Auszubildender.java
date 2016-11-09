package de.mmunce.prog2.uebung42;

public class Auszubildender extends Mitarbeiter
{
	private String bezeichnung;
	private int lehrjahr;
	
	public Auszubildender(String name, String vorname, double gehalt)
	{
		super(name, vorname, gehalt);
		this.lehrjahr = 1;
	}
	
	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	public int getLehrjahr()
	{
		return lehrjahr;
	}

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
		return "Auszubildener [name=" + name + ", vorname=" + vorname + ", gehalt=" + gehalt
				+ ", bezeichung=" + bezeichnung + ", lehrjahr=" + lehrjahr + "]";
	}
}

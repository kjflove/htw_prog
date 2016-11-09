package de.mmunce.prog2.uebung42;

public class Mitarbeiter
{

	protected String name;
	protected String vorname;
	protected double gehalt;

	public Mitarbeiter(String name, String vorname, double gehalt)
	{
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	public void gehaltErhoehen(double erhoehung) {
		if(erhoehung > 0)
		{
			this.setGehalt(getGehalt() + erhoehung);
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	public double getGehalt()
	{
		return gehalt;
	}

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

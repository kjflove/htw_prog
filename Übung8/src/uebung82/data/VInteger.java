package uebung82.data;

import uebung82.interfaces.Vergleichbar;

/**
 * Erweiterung von {@link Integer}. Implementiert {@link Vergleichbar}.
 * @author s0555992 Marcel Munce
 *
 */
public class VInteger extends Integer implements Vergleichbar
{

	public VInteger(int w)
	{
		super(w);
	}

	@Override
	public int vergleicheMit(Vergleichbar obj)
	{
		if(obj != null && obj instanceof VInteger)
		{
			VInteger other = (VInteger) obj;
			return this.getWert() - other.getWert();
		}
		return 0;
	}
	
	@Override
	public String toString()
	{
		return ""+ getWert();
	}
}

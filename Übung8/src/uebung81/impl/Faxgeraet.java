package uebung81.impl;

import uebung81.interfaces.Fax;

/**
 * Implementierung von {@link Fax}.
 * @author s0555992 Marcel Munce
 *
 */
public class Faxgeraet implements Fax
{
	private static int count = 1;
	private final String NAME;
	
	public Faxgeraet()
	{
		NAME = "Fax" + (count++);
	}
	
	public String getName()
	{
		return NAME;
	}
	
	
	@Override
	public void senden(String sendeRef)
	{
		System.out.println(String.format(faxsimulation, getName(), sendeRef));
	}

}

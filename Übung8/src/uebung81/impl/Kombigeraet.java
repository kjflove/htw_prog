package uebung81.impl;

import uebung81.interfaces.Drucker;
import uebung81.interfaces.Fax;

/**
 * Implementierung von {@link Drucker} und {@link Fax}.
 * @author s0555992 Marcel Munce
 *
 */
public class Kombigeraet implements Fax, Drucker
{
	private static int count = 1;
	private final String NAME;
	
	public Kombigeraet()
	{
		NAME = "Kombi" + (count++);
	}
	
	public String getName()
	{
		return NAME;
	}
	
	@Override
	public void drucken(String druckRef)
	{
		System.out.println(String.format(drucksimulation, getName(), druckRef));
	}
	
	@Override
	public void senden(String sendeRef)
	{
		System.out.println(String.format(faxsimulation, getName(), sendeRef));
	}
}

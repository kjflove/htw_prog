package uebung71.impl;

import uebung71.interfaces.Drucker;

/**
 * Implementierung von {@link Drucker}.
 * @author s0555992 Marcel Munce
 *
 */
public class Laserdrucker implements Drucker
{
	private static int count = 1;
	private final String NAME;
	
	public Laserdrucker()
	{
		NAME = "Laser" + (count++);
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

}

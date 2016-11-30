package uebung82;

import uebung82.data.VInteger;
import uebung82.util.NuetzlicheFunktionen;

/**
 * Testklasse
 * @author s0555992 Marcel Munce
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		VInteger[] array =
			{
					null,
					new VInteger(4),
					new VInteger(5),
					new VInteger(1),
					null,
					new VInteger(-2),
					new VInteger(40),
					new VInteger(23),
					new VInteger(-10),
					new VInteger(8),
					null
			};
		
		System.out.println(NuetzlicheFunktionen.kleinstesElement(array));
	}

}

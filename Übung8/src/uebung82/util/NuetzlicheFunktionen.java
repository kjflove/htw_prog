package uebung82.util;

import uebung82.interfaces.Vergleichbar;

public class NuetzlicheFunktionen
{
	/**
	 * bestimmt ein kleinstes (auf Basis der Vergleichbar - Implementierung)
	 * Element des Parameter - Arrays
	 * 
	 * @param array
	 *            übergebenes Array
	 * 
	 * @return ein kleinstes Element des übergebenen Arrays
	 */
	public static Vergleichbar kleinstesElement(Vergleichbar[] array)
	{
		if(array.length == 0)
		{
			System.err.println("Array leer!");
			return null;
		}
		
		Vergleichbar min = array[0];
		for(int i = 1; i < array.length; i++)
		{
			// Skip null
			if(min == null || min.vergleicheMit(array[i]) >= 1)
			{
				min = array[i];
			}
		}
		return min;
	}
}

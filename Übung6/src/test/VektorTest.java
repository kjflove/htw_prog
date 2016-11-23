package test;

import math.Vektor;

/**
 * Testen von Vektoren
 * @author Marcel Munce - s0555992
 *
 */
public class VektorTest
{

	public static void main(String[] args)
	{
		Vektor v1 = new Vektor(new float[]{1, 2, 3});
		// toString
		System.out.println(v1);
		
		// length
		System.out.println(v1.length());
	}

}

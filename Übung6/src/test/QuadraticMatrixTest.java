package test;

import math.QuadraticMatrix;

/**
 * Testen von quadratische Matrizen
 * @author Marcel Munce - s0555992
 *
 */
public class QuadraticMatrixTest
{

	public static void main(String[] args)
	{
		QuadraticMatrix m1 = new QuadraticMatrix(new float[][] {{1, 2, 3}, {0,2,0}, {0,0,3}});
		// toString
		System.out.println(m1);
		
		// pow
		QuadraticMatrix m2 = m1.pow(3);
		System.out.println(m2);
		
		// pow(0) -> Liefert Einheitsmatrix
		System.out.println(m1.pow(0));
		
		try
		{
			// Daten ungültig
			new QuadraticMatrix(new float[][]{{1, 2, 3}, {0}, {}});
		} catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

package math;

/**
 * Klasse zur Erstellung von Vektoren.
 * @author Marcel Munce - s0555992
 *
 */
public class Vektor extends Matrix
{

	/**
	 * Konstruktor für Vektor
	 * @param data Werte des Vektors
	 */
	public Vektor(float[] data)
	{
		super(new float[][] {data});
	}

	/**
	 * Berechnung des Betrags des Vektors
	 * @return Vektorlänge
	 */
	public double length()
	{
		double sum = 0f;
		for(float f : getData()[0])
		{
			sum += f * f;
		}
		return Math.sqrt(sum);
	}
	
}

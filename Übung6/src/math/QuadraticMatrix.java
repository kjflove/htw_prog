package math;

/**
 * Klasse zur Erstellung von Quadratischen Matrizen
 * @author Marcel Munce - s0555992
 *
 */
public class QuadraticMatrix extends Matrix
{

	/**
	 * Konstruktor für quadratische Matrizen
	 * @param data Werte der Matrix
	 * @throws IllegalArgumentException Geworfen, wenn gegebenes Feld nicht quadratisch ist
	 */
	public QuadraticMatrix(float[][] data) throws IllegalArgumentException
	{
		super(checkQuadratic(data));
	}
	
	/**
	 * Potenzieren der Matrix.<br>
	 * Matrix^0 liefert die Einheitsmatrix.
	 * @param n Potenz
	 * @return Neue Matrix-Instanz mit Werte matrix^n
	 */
	public QuadraticMatrix pow(int n)
	{
		Matrix tmp = new Matrix(getData());
		
		if(n == 0)
		{
			return new IdentityMatrix(getData().length);
		}
		
		for(int i = 1; i < n; i++)
		{
			tmp = tmp.multiply(this);
		}
			
		return new QuadraticMatrix(tmp.getData());
	}
	
	private static float[][] checkQuadratic(float[][] data) throws IllegalArgumentException
	{
		if(data.length == 0 || data.length != data[0].length)
		{
			throw new IllegalArgumentException("No quadratic matrix data");
		}
		return data;
	}
}

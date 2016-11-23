package math;

/**
 * Klasse zur Erstellung von Einheitsmatrizen
 * @author Marcel Munce - s0555992
 *
 */
public class IdentityMatrix extends QuadraticMatrix
{

	/**
	 * Erstellt die Einheitsmatrix mit gegebener Dimension
	 * @param dimension Dimension der Matrix
	 * @throws IllegalArgumentException
	 */
	public IdentityMatrix(int dimension) throws IllegalArgumentException
	{
		super(getIdentityData(dimension));
	}

	private static float[][] getIdentityData(int dimension)
	{
		float[][] result = new float[dimension][dimension];
		
		for(int i = 0; i < dimension; i++)
		{
			result[i][i] = 1;
		}
		
		return result;
	}
}

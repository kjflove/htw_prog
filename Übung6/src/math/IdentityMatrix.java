package math;

public class IdentityMatrix extends QuadraticMatrix
{

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

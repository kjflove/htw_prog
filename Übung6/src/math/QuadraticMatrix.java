package math;

public class QuadraticMatrix extends Matrix
{

	public QuadraticMatrix(float[][] data) throws IllegalArgumentException
	{
		super(checkQuadratic(data));
	}
	
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

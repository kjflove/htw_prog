package math;

public class Vektor extends Matrix
{

	public Vektor(float[] data)
	{
		super(new float[][] {data});
	}

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

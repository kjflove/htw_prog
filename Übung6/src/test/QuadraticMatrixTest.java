package test;

import math.QuadraticMatrix;

public class QuadraticMatrixTest
{

	public static void main(String[] args)
	{
		QuadraticMatrix m1 = new QuadraticMatrix(new float[][] {{1, 2, 3}, {0,2,0}, {0,0,3}});
		System.out.println(m1);
		
		QuadraticMatrix m2 = m1.pow(3);
		System.out.println(m2);
		
		System.out.println(m1.pow(0));
	}

}

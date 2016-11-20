package test;

import math.Vektor;

public class VektorTest
{

	public static void main(String[] args)
	{
		Vektor v1 = new Vektor(new float[]{1, 2, 3});
		System.out.println(v1);
		System.out.println(v1.length());
		
		System.out.println(v1.multiplyScalar(3));
	}

}

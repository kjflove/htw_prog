package de.mmunce.prog2.uebung41.test;

import de.mmunce.prog2.uebung41.Rechner;

public class RechnerTest
{

	public static void main(String[] args)
	{
		String[] calc = new String[]{"13.4", "add", "7"};
		calc = new String[]{"12", "div", "0"};
		calc = new String[]{"12.3", "sub", "20"};
		calc = new String[]{"3", "mul", "4"};
		calc = new String[]{"12", "div", "6"};
		calc = new String[]{"12", "", "0"};
		calc = new String[]{"12", "0"};
		calc = new String[]{"12", "asd", "0"};

		Rechner.main(calc);
	}

}

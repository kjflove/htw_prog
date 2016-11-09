package de.mmunce.prog2.uebung41;

import java.util.Locale;

public class Rechner
{

	public static void main(String[] args)
	{
		if (args.length != 3)
		{
			System.err.println("Ungültige Anzahl Argumente.");
			System.exit(-1);
		}

		try
		{
			String op = args[1];

			double numA = Double.parseDouble(args[0]);
			double numB = Double.parseDouble(args[2]);

			double result = calc(numA, numB, op);
			System.out.printf(Locale.US, "%s %s %s ist %.3f%n", args[0], op, args[2], result);
		} catch (NumberFormatException e)
		{
			System.err.println("Keine gültigen Zahlen eingegeben.");
			System.exit(-2);
		} catch (IllegalArgumentException e)
		{
			System.err.println(e.getMessage());
			System.exit(-3);
		} catch (ArithmeticException e)
		{
			System.err.println(e.getMessage());
			System.exit(-4);
		}
	}

	private static double calc(double a, double b, String op) throws IllegalArgumentException, ArithmeticException
	{
		if (op == null || op.trim().isEmpty())
		{
			throw new IllegalArgumentException("Keine Operation angegeben.");
		}
		if (op.equals("add"))
		{
			return (a + b);
		} else if (op.equals("sub"))
		{
			return (a - b);
		} else if (op.equals("mul"))
		{
			return (a * b);
		} else if (op.equals("div"))
		{
			if (b == 0)
			{
				throw new ArithmeticException("Division durch 0.");
			}
			return (a / b);
		} else
		{
			throw new IllegalArgumentException("Ungültige Operation angegeben (" + op + ").");
		}
	}
}

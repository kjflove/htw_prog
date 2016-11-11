package de.mmunce.prog2.uebung41;

import java.util.Locale;

/**
 * Taschenrechner mit �bergabeparametern
 * @author Marcel Munce - s0555992
 *
 */
public class Rechner
{

	/**
	 * F�hrt Grundrechenarten aus. <br>
	 * Aufruf: <code>Zahl1 operation Zahl2</code>. <br>
	 * G�ltige Operationen: <code>add</code>, <code>sub</code>, <code>mul</code>, <code>div</code>.<br>
	 * Exitcodes: <code>0</code>(OK), <code>-1</code>(Ung�ltige Parameteranzahl), <code>-2</code>(Keine g�ltigen Zahlen),
	 * <code>-3</code>(Ung�ltige Operation), <code>-4</code>(Teilung durch 0)
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Pr�fen ob Anzahl der Argumente stimmt
		if (args.length != 3)
		{
			System.err.println("Ung�ltige Anzahl Argumente.");
			System.exit(-1);
		}

		try
		{
			// Parameter auslesen und parsen
			String op = args[1];

			double numA = Double.parseDouble(args[0]);
			double numB = Double.parseDouble(args[2]);

			double result = calc(numA, numB, op);
			
			// Ausgabe
			System.out.printf(Locale.US, "%s %s %s ist %.3f%n", args[0], op, args[2], result);
		} catch (NumberFormatException e)
		{
			System.err.println("Keine g�ltigen Zahlen eingegeben.");
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
		// Pr�fen, ob Operation gesetzt
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
			throw new IllegalArgumentException("Ung�ltige Operation angegeben (" + op + ").");
		}
	}
}

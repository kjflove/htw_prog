package de.mmunce.prog2.uebung1.test;

import java.util.Arrays;

import de.mmunce.prog2.uebung1.Arrayelement;

/**
 * Testklasse für {@link Arrayelement}
 * @author Marcel Munce - s0555992
 *
 */
public class ArrayelementTest {

	public static void main(String[] args) {
		System.out.println("= Ein häufigstes Element ====");
		byte[] arr = new byte[]{1, 2, 3, 3, 4, 5, 7};
		System.out.println(Arrays.toString(arr));
		byte[] result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));
		
		System.out.println("\n= Zwei häufigste Elemente ====");
		arr = new byte[]{1, 2, 3, 3, 4, 5, 5, 7};
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));

		/**
		 * Tests für Grenzfall, wenn ein häufigstes Element den höchsten Wert hat und nach dem Sortieren am Ende steht
		 */
		System.out.println("\n= Ein häufigstes Element (am größten) ====");
		arr = new byte[]{1, 2, 3, 3, 4, 5, 7, 7, 7};
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));

		System.out.println("\n= Zwei häufigste Elemente (eines am größten) ====");
		arr = new byte[]{1, 2, 3, 3, 4, 5, 5, 7, 7};
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));
		
		System.out.println("\n= Leeres Eingabearray ====");
		arr = new byte[0];
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));
	}

}

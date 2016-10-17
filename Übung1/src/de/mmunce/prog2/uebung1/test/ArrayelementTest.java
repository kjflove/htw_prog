package de.mmunce.prog2.uebung1.test;

import java.util.Arrays;

import de.mmunce.prog2.uebung1.Arrayelement;

/**
 * Testklasse f�r {@link Arrayelement}
 * @author Marcel Munce - s0555992
 *
 */
public class ArrayelementTest {

	public static void main(String[] args) {
		System.out.println("= Ein h�ufigstes Element ====");
		byte[] arr = new byte[]{1, 2, 3, 3, 4, 5, 7};
		System.out.println(Arrays.toString(arr));
		byte[] result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));
		
		System.out.println("\n= Zwei h�ufigste Elemente ====");
		arr = new byte[]{1, 2, 3, 3, 4, 5, 5, 7};
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));

		/**
		 * Tests f�r Grenzfall, wenn ein h�ufigstes Element den h�chsten Wert hat und nach dem Sortieren am Ende steht
		 */
		System.out.println("\n= Ein h�ufigstes Element (am gr��ten) ====");
		arr = new byte[]{1, 2, 3, 3, 4, 5, 7, 7, 7};
		System.out.println(Arrays.toString(arr));
		result = Arrayelement.haeufigstesElem(arr);
		System.out.println(Arrays.toString(result));

		System.out.println("\n= Zwei h�ufigste Elemente (eines am gr��ten) ====");
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

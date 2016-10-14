package de.mmunce.prog2.uebung1;

public class VektorTest {

	public static void main(String[] args) {
		testTransponieren();
		testSkalarProdukt();
	}

	private static void testTransponieren() {
		System.out.println("- Test Transponieren ----");
		Vektor v1 = new Vektor(new float[]{1, 2, 3, 4}, false);

		System.out.println("istZeilenvektor: " + v1.istZeilenvektor());
		System.out.println(v1);	// toString()
		
		System.out.println("> Transponiere");
		v1.transponiere();
		
		System.out.println("istZeilenvektor: " + v1.istZeilenvektor());
		System.out.println(v1);	// toString()
		System.out.println();
	}
	
	private static void testSkalarProdukt() {
		System.out.println("- Test SkalarProdukt ----");
		Vektor v1 = new Vektor(new float[]{1, 2, 3}, false);
		Vektor v2 = new Vektor(new float[]{2, 4, 8}, false);

		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		System.out.println("SkalarProdukt: " + v1.skalarProdukt(v2));
	}
}

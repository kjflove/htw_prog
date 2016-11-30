package uebung71.interfaces;

public interface Drucker
{

	String drucksimulation = "Drucker %s meldet sich%nDas Drucken wird simuliert%n%s";
	
	/**
	 * Drucken des &uuml;bergebenen Strings.
	 * @param druckRef
	 */
	void drucken(String druckRef);
}

package uebung81.interfaces;

public interface Fax
{
	String faxsimulation = "Absender ist: %s%nDas Senden wird simuliert%n%s";
	
	/**
	 * Senden des &uuml;bergebenen Strings.
	 * @param sendeRef
	 */
	void senden(String sendeRef);
}

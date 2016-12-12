package login.exception;

/**
 * Exceptionklasse f&uuml;r fehlende Berechtigungen.
 *
 * @author s0555992 - Marcel Munce
 *
 */
public class KeineBerechtigungException extends Exception
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Standardkonstruktor mit vordefinierter Fehlermeldung:<br>
	 * <code>"Nutzer ist nicht authentifiziert!"</code>
	 */
	public KeineBerechtigungException()
	{
		super("Nutzer ist nicht authentifiziert!");
	}
}

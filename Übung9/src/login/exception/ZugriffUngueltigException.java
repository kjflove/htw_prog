package login.exception;

/**
 * Exceptionklasse für ung&uuml;ltigen Zugriff.
 *
 * @author s0555992 - Marcel Munce
 *
 */
public class ZugriffUngueltigException extends Exception
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Standardkonstruktor mit vordefinierter Fehlermeldung:<br>
	 * <code>"Nutzername und/oder Passwort ung\u00fcltig!"</code>
	 */
	public ZugriffUngueltigException()
	{
		super("Nutzername und/oder Passwort ung\u00fcltig!");
	}
}

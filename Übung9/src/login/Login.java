package login;

import login.exception.KeineBerechtigungException;
import login.exception.ZugriffUngueltigException;

/**
 * Klasse mit Authentifizierungsmechanismus zur &Uuml;bung von Exceptions.
 *
 * @author s0555992 - Marcel Munce
 *
 */
public class Login
{

	private boolean angemeldet;

	/**
	 * Konstruktor
	 */
	public Login()
	{
		angemeldet = false;
	}

	/**
	 * Ausf&uuml;hren des Logins (admin:admin).<br>
	 *
	 * @param benutzer
	 * @param passwort
	 * @throws ZugriffUngueltigException
	 *             bei ung&uuml;ltiger Kombination aus Nutzername und Passwort
	 */
	public void anmelden(String benutzer, String passwort) throws ZugriffUngueltigException
	{
		if ("admin".equals(benutzer) && "admin".equals(passwort))
		{
			angemeldet = true;
		}
		else
		{
			throw new ZugriffUngueltigException();
		}
	}

	/**
	 * Angemeldeten Nutzer abmelden.
	 */
	public void abmelden()
	{
		angemeldet = false;
	}

	/**
	 * Simuliert einen Bearbeitungsvorgang.<br>
	 *
	 * @throws KeineBerechtigungException
	 *             wenn Nutzer nicht angemeldet ist.
	 */
	public void bearbeiten() throws KeineBerechtigungException
	{
		if (!angemeldet)
		{
			throw new KeineBerechtigungException();
		}

		System.out.println(">> Bearbeiten der Nutzerdaten");
	}
}

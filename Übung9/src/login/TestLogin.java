package login;

import java.util.Scanner;

import login.exception.KeineBerechtigungException;
import login.exception.ZugriffUngueltigException;

/**
 * Testklasse f&uuml;r Login
 */
public class TestLogin
{
	public static void main(String[] args)
	{
		Login login = new Login();
		Scanner input = new Scanner(System.in);
		String benutzer = "";
		String passwort = "";
		System.out.print("Bitte geben Sie den Benutzernamen ein: ");
		benutzer = input.next();
		System.out.print("Bitte geben Sie das Passwort ein: ");
		passwort = input.next();
		input.close();
		try
		{
			System.out.println("Sie werden angemeldet ...");
			login.anmelden(benutzer, passwort);
			System.out.println("Anmeldung erfolgreich!");
		}
		catch (ZugriffUngueltigException ex)
		{
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Methode bearbeiten() wird aufgerufen ...");
			login.bearbeiten();
		}
		catch (KeineBerechtigungException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Sie werden abgemeldet ...");
		login.abmelden();
		try
		{
			System.out.println("Methode bearbeiten() wird aufgerufen ...");
			login.bearbeiten();
		}
		catch (KeineBerechtigungException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

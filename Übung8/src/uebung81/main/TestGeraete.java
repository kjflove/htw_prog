package uebung81.main;

import uebung81.impl.Faxgeraet;
import uebung81.impl.Kombigeraet;
import uebung81.impl.Laserdrucker;

/**
 * Testklasse
 * @author s0555992 Marcel Munce
 *
 */
public class TestGeraete
{

	public static void main(String[] args)
	{
		Laserdrucker l1 = new Laserdrucker();
		Laserdrucker l2 = new Laserdrucker();
		Faxgeraet f1 = new Faxgeraet();
		Faxgeraet f2 = new Faxgeraet();
		Kombigeraet k1 = new Kombigeraet();
		Kombigeraet k2 = new Kombigeraet();
		f1.senden("Dies ist ein Test");
		f2.senden("Dies ist ein Test");
		l1.drucken("Dies ist ein Test");
		l2.drucken("Dies ist ein Test");
		k1.senden("Dies ist ein Test");
		k2.senden("Dies ist ein Test");
		k1.drucken("Dies ist ein Test");
		k2.drucken("Dies ist ein Test");
	}

}

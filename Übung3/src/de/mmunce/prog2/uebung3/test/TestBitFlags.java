package de.mmunce.prog2.uebung3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import de.mmunce.prog2.uebung3.BitFlags;

public class TestBitFlags {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	private BitFlags allOff;
	private BitFlags allOn;

	@Before
	public void setUp() throws Exception {
		allOff = new BitFlags(0);					// 00000000 .... 0
		allOn = new BitFlags(Integer.MAX_VALUE);	// 01111111 .... 1
	}

	@Test
	public void testSwitchOnSuccess() {
		assertEquals(0, allOff.getStatus());
		allOff.switchOn(2); 	// 2^2 = 4
		assertEquals(4, allOff.getStatus());
		allOff.switchOn(10);	// 2^10 = 1024 + 4 = 1028
		assertEquals(1028, allOff.getStatus());
	}
	
	@Test
	public void testSwitchOnFail() {
		// Überschreiten der Indizes
		assertEquals(0, allOff.getStatus());
		exception.expect(IllegalArgumentException.class);
		allOff.switchOn(32); 	// Integer hat 32 Bits (Indizes 0 - 31)
		exception.expect(IllegalArgumentException.class);
		allOff.switchOn(-1);
	}
	
	@Test
	public void testSwitchOnAlreadyOn() {
		// Wert darf sich nicht ändern, da bits bereits auf 1
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		allOn.switchOn(16);
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		allOn.switchOn(2);
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
	}
	
	@Test
	public void testSwitchOffSuccess() {
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		allOn.switchOff(8);		// 2^8 = 256 -> Integer.MAX_VALUE - 256
		assertEquals(Integer.MAX_VALUE - 256, allOn.getStatus());
		allOn.switchOff(16);	// 2^16 = 65536 -> Integer.MAX_VALUE - 256 - 65536
		assertEquals(Integer.MAX_VALUE - 65792, allOn.getStatus());
	}
	
	@Test
	public void testSwitchOffFail() {
		// Überschreiten der Indizes
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		exception.expect(IllegalArgumentException.class);
		allOn.switchOff(32); 	// Integer hat 32 Bits (Indizes 0 - 31)
		exception.expect(IllegalArgumentException.class);
		allOn.switchOff(-1);
	}
	
	@Test
	public void testSwitchOffAlreadyOff() {
		// Alle Bits bereits 0 -> Keine Änderung des Wertes
		assertEquals(0, allOff.getStatus());
		allOff.switchOff(2);
		assertEquals(0, allOff.getStatus());
		allOff.switchOff(10);
		assertEquals(0, allOff.getStatus());
	}
	
	@Test
	public void testSwapSuccessOnOff() {
		// Bit auf 1
		assertEquals(0, allOff.getStatus());
		allOff.swap(16); 	// 2^16 = 65536
		assertEquals(65536, allOff.getStatus());
		// Bit auf 0
		allOff.swap(16);
		assertEquals(0, allOff.getStatus());
	}
	
	@Test
	public void testSwapSuccessOffOn() {
		// Bit auf 0
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		allOn.swap(8);		// 2^8 = 256 -> Integer.MAX_VALUE - 256
		assertEquals(Integer.MAX_VALUE - 256, allOn.getStatus());
		// Bit auf 1
		allOn.swap(8);
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
	}
	
	@Test
	public void testSwapFail() {
		// Überschreiten der Indizes
		exception.expect(IllegalArgumentException.class);
		allOn.swap(32); 	// Integer hat 32 Bits (Indizes 0 - 31)
		exception.expect(IllegalArgumentException.class);
		allOff.swap(-1);
	}
	
	@Test
	public void testIsSetSuccessSet() {
		// Bits auf 1
		assertEquals(Integer.MAX_VALUE, allOn.getStatus());
		assertTrue(allOn.isSet(16));
		assertTrue(allOn.isSet(7));
		assertTrue(allOn.isSet(2));
	}
	
	@Test
	public void testIsSetSuccessUnset() {
		// Bits auf 0
		assertEquals(0, allOff.getStatus());
		assertFalse(allOff.isSet(13));
		assertFalse(allOff.isSet(3));
		assertFalse(allOff.isSet(27));
	}
	
	@Test
	public void testIsSetFail() {
		// Überschreiten der Indizes
		exception.expect(IllegalArgumentException.class);
		allOn.isSet(32); 	// Integer hat 32 Bits (Indizes 0 - 31)
		exception.expect(IllegalArgumentException.class);
		allOff.isSet(-1);
	}
}

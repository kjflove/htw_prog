package de.mmunce.prog2.uebung2.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import de.mmunce.prog2.uebung2.Matrix;

/**
 * Klasse zum Testen von {@link Matrix}
 * @author Marcel Munce - s0555992
 *
 */
public class MatrixTest {

	private float[][] data;
	private Matrix m1;
	
	@Before
	public void setUp() {
		data = new float[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		m1 = new Matrix(data);
	}
	
	/**
	 *	Test für Hilfsmethode zum Kopieren eines mehrdimensionalen Arrays. 
	 */
	@Test
	public void testArrayCopy() {
		float[][] arr = new float[][]{
			{0, 1, 1},
			{1, 0, 1}
		};
		float[][] copy = this.copyData(arr);
		assertTrue(Arrays.deepEquals(arr, copy));
		copy[1][2] = 5;
		assertFalse(Arrays.deepEquals(arr, copy));
	}
	
	/**
	 * Test {@link Matrix#equals(Object)} Normalfall
	 */
	@Test
	public void testEqualsSuccess() {
		float[][] data2 = new float[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		Matrix m2 = new Matrix(data2);
		assertTrue(m1.equals(m2));
	}
	
	/**
	 * Test {@link Matrix#equals(Object)} ungleich
	 */
	@Test
	public void testEqualsFail() {
		float[][] data2 = copyData(data);
		data2[0][0] = 100;
		Matrix m2 = new Matrix(data2);
		assertFalse(m1.equals(m2));
	}
	
	/**
	 * Test {@link Matrix#equals(Object)} leere
	 */
	@Test
	public void testEqualsEmpty() {
		Matrix m2 = new Matrix(new float[0][0]);
		assertFalse(m1.equals(m2));
	}

	/**
	 * Test {@link Matrix#multiply(Matrix)} Normalfall
	 */
	@Test
	public void testMultiplySuccess() {
		float[][] data2 = {
			{1, 0, 1},
			{0, 1, 0},
			{1, 1, 0}
		};
		float[][] should = {
				{4, 5, 1},
				{10, 11, 4},
				{16, 17, 7}
		};
		Matrix m2 = new Matrix(data2);
		Matrix product = m1.multiply(m2);
		assertTrue(Arrays.deepEquals(should, product.getData()));
	}
	
	/**
	 * Test {@link Matrix#multiply(Matrix)} mit nicht verkettbaren Matrizen.
	 */
	@Test
	public void testMultiplyFail() {
		float[][] data2 = {
				{1, 0, 1}
		};
		Matrix m2 = new Matrix(data2);
		IllegalArgumentException e = null;
		try {
			m1.multiply(m2);
			fail("Matrizen nicht verkettbar!");
		} catch (IllegalArgumentException ex) {
			e = ex;
		}
		assertNotNull(e);
		e = null;
		
		Matrix m3 = new Matrix(new float[3][0]);
		try {
			m1.multiply(m3);
			fail("Ungültige Matrix!");
		} catch (IllegalArgumentException ex) {
			e = ex;
		}
		assertNotNull(e);
	}
	/**
	 * Test {@link Matrix#multiply(Matrix)} mit einspaltiger Matrix
	 */
	@Test
	public void testMultiplyVectorSuccess() {
		float[][] data2 = {
				{1},
				{0},
				{1}
		};
		float[][] should = {
				{4},
				{10},
				{16}
		};
		Matrix m2 = new Matrix(data2);
		Matrix prod = m1.multiply(m2);
		assertTrue(Arrays.deepEquals(should, prod.getData()));
	}
	
	/**
	 * Test {@link Matrix#multiplyScalar(float)} mit positivem Skalar
	 */
	@Test
	public void testMultiplyScalarPos() {
		float scalar = 2f;
		float[][] should = new float[][] {
			{2, 4, 6},
			{8, 10, 12},
			{14, 16, 18}
		};
		Matrix m2 = m1.multiplyScalar(scalar);
		assertTrue(Arrays.deepEquals(should, m2.getData()));
	}
	
	/**
	 * Test {@link Matrix#multiplyScalar(float)} mit Skalar 0 
	 */
	@Test
	public void testMultiplyScalarZero() {
		float scalar = 0f;
		float[][] should = new float[][] {
			{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0}
		};
		Matrix m2 = m1.multiplyScalar(scalar);
		assertTrue(Arrays.deepEquals(should, m2.getData()));
	}
	
	/**
	 * Test {@link Matrix#multiplyScalar(float)} mit negativem Skalar
	 */
	@Test
	public void testMultiplyScalarNeg() {
		float scalar = -2f;
		float[][] should = new float[][] {
			{-2, -4, -6},
			{-8, -10, -12},
			{-14, -16, -18}
		};
		Matrix m2 = m1.multiplyScalar(scalar);
		assertTrue(Arrays.deepEquals(should, m2.getData()));
	}
	
	/**
	 * Test {@link Matrix#add(Matrix)} Normalfall
	 */
	@Test
	public void testAddSuccess() {
		float[][] data2 = copyData(data);
		float[][] should = new float[][] {
			{2, 4, 6},
			{8, 10, 12},
			{14, 16, 18}
		};
		Matrix m2 = m1.add(new Matrix(data2));
		assertTrue(Arrays.deepEquals(should, m2.getData()));
	}
	
	/**
	 * Test {@link Matrix#add(Matrix)} mit unterschiedlich großen Matrizen
	 */
	@Test
	public void testAddFail() {
		float[][] data2 = {
				{1, 0, 1}
		};
		Matrix m2 = new Matrix(data2);
		IllegalArgumentException e = null;
		try {
			m1.add(m2);
			fail("Matrizen unterschiedlich groß!");
		} catch (IllegalArgumentException ex) {
			e = ex;
		}
		assertNotNull(e);
	}
	
	/**
	 * Test {@link Matrix#add(Matrix)} mit Übergabe <code>null</code>.
	 */
	@Test
	public void testAddNull() {
		IllegalArgumentException e = null;
		try {
			m1.add(null);
			fail("Ungültige Eingabe!");
		} catch (IllegalArgumentException ex) {
			e = ex;
		}
		assertNotNull(e);
	}

	/**
	 * Hilfsmethode zum kopieren eines Mehrdimensionalen Arrays
	 * @param data
	 * @return
	 */
	private float[][] copyData(float[][] data) {
		return Arrays.stream(data)
				.map((float[] row) -> row.clone())
				.toArray((int length) -> new float[length][]);
	}
}

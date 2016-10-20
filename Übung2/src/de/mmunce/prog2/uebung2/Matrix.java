package de.mmunce.prog2.uebung2;

import java.util.Arrays;

/**
 * Klasse zur Erzeugung von Matrizen,
 * die einfache Rechenoperationen auf Matrizen ausführen kann.
 * @author Marcel Munce - s0555992
 *
 */
public class Matrix {

	private float[][] data;
	
	/**
	 * Konstruktor für Matrizen
	 * @param data - Werte der Matrix
	 */
	public Matrix(float[][] data) {
		this.data = data;
	}
	
	/**
	 * Addieren von zwei Matrizen. <br>
	 * Ergebnis wird als neue Matrix zurückgegeben.
	 * @param b Zweite Matrix
	 * @return Summe der Matrizen
	 * @throws IllegalArgumentException wenn Dimensionen unterschiedlich
	 */
	public Matrix add(Matrix b) throws IllegalArgumentException{
		if(b == null || b.data.length == 0 || b.data[0].length == 0) {
			throw new IllegalArgumentException("Ungültige/leere Matrix übergeben!");
		}
		if(this.data.length != b.data.length || this.data[0].length != b.data[0].length) {
			throw new IllegalArgumentException("Matrizen unterschiedlich groß!");
		}
		
		float[][] result = new float[this.data.length][this.data[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				result[i][j] = this.data[i][j] + b.data[i][j];
			}
		}
		return new Matrix(result);
	}
	
	/**
	 * Multiplikation einer Matrix mit einem Skalar. <br>
	 * Ergebnis wird als neue Matrix zurückgegeben.
	 * @param s Skalar
	 * @return Produkt aus Matrix und Skalar
	 */
	public Matrix multiplyScalar(float s) {
		float[][] result = new float[this.data.length][this.data[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				result[i][j] = this.data[i][j] * s;
			}
		}
		return new Matrix(result);
	}
	
	/**
	 * Multiplizieren von zwei Matrizen. <br>
	 * Ergebnis wird als neue Matrix zurückgegeben.
	 * @param b Zweite Matrix
	 * @return Produkt der Matrizen
	 * @throws IllegalArgumentException wenn Matrizen nicht verkettbar.
	 */
	public Matrix multiply(Matrix b) throws IllegalArgumentException {
		if(b == null || b.data.length == 0 || b.data[0].length == 0) {
			throw new IllegalArgumentException("Ungültige/leere Matrix übergeben!");
		}
		
		if(this.data[0].length != b.data.length) {
			throw new IllegalArgumentException("Matrizen nicht verkettbar!");
		}
		
		float[][] result = new float[this.data.length][b.data[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				for(int k = 0; k < b.data.length; k++) {
					result[i][j] += this.data[i][k] * b.data[k][j];
				}
			}
		}
		return new Matrix(result);
	}
	
	/**
	 * @return Werte der Matrix
	 */
	public float[][] getData() {
		return this.data;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(!(arg0 instanceof Matrix)) {
			return false;
		}
		
		Matrix m2 = (Matrix) arg0;
		
		return Arrays.deepEquals(this.data, m2.data);
	}

}

package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;

	// costruttore
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public void calcolaArea() {

		System.out.println("Area= " + (base * altezza));
	}

	public void calcolaPerimetro() {

		System.out.println("Perimetro= " + (2 * (base * altezza)));
	}

}

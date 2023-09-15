package org.lessons.java.geometria;

import java.util.Iterator;

public class Rettangolo {
	public int base;
	public int altezza;

	// costruttore
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public void calcolaArea() {

		System.out.println("Base: " + this.base);
		System.out.println("Altezza: " + this.altezza);
		System.out.println("Area= " + (base * altezza));
	}

	public void calcolaPerimetro() {

		System.out.println("Base: " + this.base);
		System.out.println("Altezza: " + this.altezza);
		System.out.println("Perimetro= " + (2 * (base * altezza)));
	}

	public void disegna() {

		System.out.println("Base: " + this.base);
		System.out.println("Altezza: " + this.altezza);
		calcolaPerimetro();
		calcolaArea();

		String baseDrawed = " ";
		String whiteSpaces = " ";

		for (int i = 0; i < this.base; i++) {
			baseDrawed = baseDrawed + "o";
			whiteSpaces = whiteSpaces + " ";
		}

		System.out.println(baseDrawed);

		for (int i = 0; i < (this.altezza - 2); i++) {
			String LeftSideDrawed = "o";

			String RightSideDrawed = whiteSpaces + "o";
			System.out.println(LeftSideDrawed + RightSideDrawed);
		}

		System.out.println(baseDrawed);

	}
}

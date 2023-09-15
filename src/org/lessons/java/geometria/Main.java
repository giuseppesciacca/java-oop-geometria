package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Base rettangolo n.1? ");
		int baseRet1 = sc.nextInt();

		System.out.print("Altezza rettangolo n.1? ");
		int altezzaRet1 = sc.nextInt();

		Rettangolo rettangolo1 = new Rettangolo(baseRet1, altezzaRet1);

		sc.close();
		rettangolo1.calcolaArea();
		rettangolo1.calcolaPerimetro();
	}
}

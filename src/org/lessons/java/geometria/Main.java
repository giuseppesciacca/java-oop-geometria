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
		rettangolo1.disegna();
		
		System.out.print("\n*******************************\n");

		System.out.print("Base rettangolo n.2? ");
		int baseRet2 = sc.nextInt();
		System.out.print("Altezza rettangolo n.2? ");
		int altezzaRet2 = sc.nextInt();
		
		Rettangolo rettangolo2 = new Rettangolo(baseRet2, altezzaRet2);	
		rettangolo2.disegna();
		
		System.out.print("\n*******************************\n");

		System.out.print("Base rettangolo n.3? ");
		int baseRet3 = sc.nextInt();
		System.out.print("Altezza rettangolo n.3? ");
		int altezzaRet3 = sc.nextInt();
		
		sc.close();
		
		Rettangolo rettangolo3 = new Rettangolo(baseRet3, altezzaRet3);
		rettangolo3.disegna();
		
		
	}
}

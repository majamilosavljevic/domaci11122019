package domaci_11122019;

import java.util.Scanner;

public class Zadatak_3_11122019 {

	public static void main(String[] args) {
		/*
		 * Dodatni zadatak (neobavezni): Uraditi domaci zadatak od petka, koristeci
		 * grananje. Zadatak: Napisi program koji ce racunati obim i povrsinu bazena,
		 * tako sto se stranice ucitavaju preko konzole.
		 */
		double duzina = -1, sirina = -1, dubina = -1;
		System.out.println(
				"U nastavku unesite zeljene dimenzije bazena kako biste izracunali unutrasnju povrsinu i obim bazena.");
		System.out.println("Imajte u vidu da su maksimalne dozvoljene dimenzije sledece:");
		System.out.println("Duzina max = 20m");
		System.out.println("Sirina max = 20m");
		System.out.println("Dubina max = 5m");
		while (duzina <= 0 || duzina > 20) {
			try {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Unesite zeljenu duzinu bazena u metrima:");
				duzina = sc1.nextDouble();
				if (duzina <= 0 || duzina > 20) {
					System.out.println("Uneta vrednost nije u dozvoljenom opsegu, pokusajte ponovo.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Unete vrednosti nisu dozvoljene, molimo unesite broj.");
			}
		}
		while (sirina <= 0 || sirina > 20) {
			try {
				System.out.println("Unesite zeljenu sirinu bazena u metrima:");
				Scanner sc2 = new Scanner(System.in);
				sirina = sc2.nextDouble();
				if (sirina <= 0 || sirina > 20) {
					System.out.println("Uneta vrednost nije u dozvoljenom opsegu, pokusajte ponovo.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Unete vrednosti nisu dozvoljene, molimo unesite broj.");
			}
		}
		while (dubina <= 0 || dubina > 5) {
			try {
				System.out.println("Unesite zeljenu dubinu bazena u metrima:");
				Scanner sc3 = new Scanner(System.in);
				dubina = sc3.nextDouble();
				if (dubina > 0 && dubina <= 5) {
					System.out.println("Unutrasnja povrsina bazena je: "
							+ (2 * (duzina * dubina + sirina * dubina) + sirina * duzina));
					System.out.println("Obim bazena je: " + (2 * (sirina + duzina)));
				} else if (dubina <= 0 || dubina > 5) {
					System.out.println("Uneta vrednost nije u dozvoljenom opsegu, pokusajte ponovo.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Unete vrednosti nisu dozvoljene, molimo unesite broj.");
			}
		}
	}
}

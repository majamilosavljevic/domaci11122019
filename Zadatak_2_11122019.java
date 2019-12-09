package domaci_11122019;

import java.util.Scanner;

public class Zadatak_2_11122019 {

	public static void main(String[] args) {
		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 * (zahtevi zadatka namerno nisu dalje razradjivani jer 1) ostavljam vasoj masti
		 * na volju 2) zelim da budem upucena u vas tok razmisljanja).
		 */

		boolean a = false;
		int nosivost = 680;
		System.out.println("Nosivost lifta je max " + nosivost + "kg.");
		System.out.println("Unesite ukupnu tezinu osoba u liftu u kilogramima:");
		while (a == false) {

			try {

				Scanner sc = new Scanner(System.in);
				double masa = sc.nextDouble();
				a = true;
				if (masa < 0 || nosivost < 0) {
					System.out.println("Unesite ispravne vrednosti!");
				} else if (masa > nosivost) {
					System.out.println("Lift je preopterecen!");
				} else if (masa == nosivost) {
					System.out.println("Tezina osoba u liftu je na granici opterecenja!");
				} else {
					System.out.println("OK, lift je pokrenut.");
				}
			} catch (Exception e) {
				System.out.println("Uneta vrednost nije ispravna, molimo unesite broj: ");
			}
		}
	}
}
package domaci_11122019;

import java.util.Scanner;

public class Zadatak_1_11122019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji proverava da li je uneti broj paran ili neparan.
		 * Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije,
		 * program treba da ispise poruku: Broj je neparan!
		 */
	
		boolean a = false;
		while (a == false) {
			try {
				System.out.println("Unesite broj da proverite da li je paran ili neparan: ");
				Scanner sc = new Scanner(System.in);
				int broj = sc.nextInt();
				a = true;

				if (broj % 2 == 0) {
					System.out.println("Broj je paran!");
				} else {
					System.out.println("Broj je neparan!");
				}

			} catch (Exception e) {
				System.out.print("Uneta vrednost nije ispravna. ");
			}
		}
	}

}

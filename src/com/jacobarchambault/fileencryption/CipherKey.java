package com.jacobarchambault.fileencryption;

import java.util.Scanner;

public class CipherKey {
	static int offset() {
		System.out.print(
				"Enter an integer offset for your Caesar Cipher and press enter: ");
		Scanner scanner = new Scanner(
				System.in);
		String input = scanner.nextLine();
		while (!isNumber(
				input)) {
			System.out.println(
					"Invalid input. Please enter a number");
			input = scanner.nextLine();
		}
		int cipherKey = Integer.parseInt(
				input);
		scanner.close();
		return cipherKey;
	}
	private static boolean isNumber(
			String input) {
		try {
			Integer.parseInt(
					input);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}

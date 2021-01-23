package com.jacobarchambault.fileencryption;

import java.util.Scanner;

public class CipherKey {
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

	Scanner scanner;

	CipherKey(
			Scanner scanner) {
		this.scanner = scanner;
	}

	int offset() {
		System.out.print(
				"Enter an integer offset for your Caesar Cipher and press enter: ");
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

}

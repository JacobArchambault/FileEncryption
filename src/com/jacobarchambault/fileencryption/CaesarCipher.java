package com.jacobarchambault.fileencryption;

import java.util.Scanner;

public class CaesarCipher {

	private static int key() {
		System.out.print("Enter an integer for your Caesar Cipher and press enter: ");
		Scanner scanner = new Scanner(
				System.in);
		String input = scanner.nextLine();
		while (!isNumber(input)) {
			System.out.println("Invalid input. Please enter a number");
			input = scanner.nextLine();
		}
		int cipher = Integer.parseInt(input);
		scanner.close();
		return cipher;
	}

	private static boolean isNumber(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	private char applyLowerCaseCipher(int offset,
			char character) {
		return (char) ('a' + ((character - 'a' + offset) % 26));
	}

	private char applyUpperCaseCipher(int offset,
			char character) {
		return (char) ('A' + ((character - 'A' + offset) % 26));
	};

	String cipher(String message) {
		int offset = key();
		System.out.println("Encrypting file...");
		StringBuilder builder = new StringBuilder();
		for (char character : message.toCharArray()) {
			char newCharacter = character == ' ' ? ' '
					: Character.isUpperCase(character) ? applyUpperCaseCipher(offset,
							character)
							: applyLowerCaseCipher(offset,
									character);
			builder.append(newCharacter);
		}
		return builder.toString();
	}
}

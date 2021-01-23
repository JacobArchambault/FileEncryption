package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher implements Cipher {

	PrintMedium medium;

	CaesarCipher(
			PrintMedium sourceText) {
		medium = sourceText;
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

	private static int cipherKey() {
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

	private char applyLowerCaseCipher(
			int offset,
			char character) {
		return (char) ('a' + ((character - 'a' + offset) % 26));
	}

	private char applyUpperCaseCipher(
			int offset,
			char character) {
		return (char) ('A' + ((character - 'A' + offset) % 26));
	};

	public String encrypt() throws IOException {
		int offset = cipherKey();
		System.out.println(
				"Encrypting file...");
		StringBuilder builder = new StringBuilder();
		char[] charArray = textAsCharArray();
		for (char character : charArray) {
			char newCharacter = character == ' ' ? ' '
					: Character.isUpperCase(
							character)
									? applyUpperCaseCipher(
											offset,
											character)
									: applyLowerCaseCipher(
											offset,
											character);
			builder.append(
					newCharacter);
		}
		return builder.toString();
	}

	private char[] textAsCharArray() throws IOException {
		char[] charArray = medium.allText()
				.toCharArray();
		return charArray;
	}
}

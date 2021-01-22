package com.jacobarchambault.fileencryption;

import java.util.Scanner;

public class CaesarCipher {

	private static int getUserInput(){
		System.out.print("Enter an integer for your Caesar Cipher and press enter: ");
		Scanner scanner = new Scanner(System.in);
		int cipher = scanner.nextInt();
		scanner.close();
		return cipher;		
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
		int offset = getUserInput();
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

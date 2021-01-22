package com.jacobarchambault.fileencryption;

public class CaesarCipher {

	String cipher(String message,
			int offset) {
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

	private char applyLowerCaseCipher(int offset,
			char character) {
		return (char) ('a' + ((character - 'a' + offset) % 26));
	}

	private char applyUpperCaseCipher(int offset,
			char character) {
		return (char) ('A' + ((character - 'A' + offset) % 26));
	};

}

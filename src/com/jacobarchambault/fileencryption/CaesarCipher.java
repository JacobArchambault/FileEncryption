package com.jacobarchambault.fileencryption;

public class CaesarCipher {
	String cipher(String message,
			int offset) {

		StringBuilder builder = new StringBuilder();
		for (char character : message.toCharArray()) {
			if (character != ' ') {
				char newCharacter = Character.isUpperCase(character) ? upperCaseCipher(offset,
						character)
						: lowerCaseCipher(offset,
								character);
				builder.append(newCharacter);
			} else {
				builder.append(character);
			}
		}
		return builder.toString();

	}

	private char lowerCaseCipher(int offset,
			char character) {
		return (char) ('a' + ((character - 'a' + offset) % 26));
	}

	private char upperCaseCipher(int offset,
			char character) {
		return (char) ('A' + ((character - 'A' + offset) % 26));
	};

}

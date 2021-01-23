package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class CaesarCipher implements Cipher {

	PrintMedium medium;
	CipherKey cipherKey;
	StringBuilder builder;

	CaesarCipher(
			PrintMedium sourceText, CipherKey key, StringBuilder builder) {
		medium = sourceText;
		cipherKey = key;
		this.builder = builder;
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
		int offset = cipherKey.offset();
		System.out.println(
				"Encrypting file...");
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

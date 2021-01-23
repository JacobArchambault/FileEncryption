package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class EncryptedText implements Cipher {

	StringBuilder builder;
	CipherKey cipherKey;
	PrintMedium medium;

	EncryptedText(
			PrintMedium medium,
			CipherKey key,
			StringBuilder builder) {
		this.medium = medium;
		cipherKey = key;
		this.builder = builder;
	}

	@Override
	public String encrypt() throws IOException {
		int offset = cipherKey.offset();
		System.out.println(
				"Encrypting file...");
		char[] charArray = medium.allText()
				.toCharArray();
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

	private char applyLowerCaseCipher(
			int offset,
			char character) {
		return (char) ('a' + ((character - 'a' + offset) % 26));
	};

	private char applyUpperCaseCipher(
			int offset,
			char character) {
		return (char) ('A' + ((character - 'A' + offset) % 26));
	}

}

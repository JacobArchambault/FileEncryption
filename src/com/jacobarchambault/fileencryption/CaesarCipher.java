package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class CaesarCipher implements Cipher {

	SourceText sourceText;
	CipherKey cipherKey;
	StringBuilder builder;

	CaesarCipher(
			SourceText sourceText,
			CipherKey key,
			StringBuilder builder) {
		this.sourceText = sourceText;
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
		char[] charArray = sourceText.asCharArray();
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

}

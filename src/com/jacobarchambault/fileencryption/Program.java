package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class Program {

	public static void main(
			String[] args) throws IOException {

		new EncryptedFile(
				new CaesarCipher(
						new GuardedPrintMedium(
								new SourceFile(
										"MyLetters.txt")))).create();

	}
}

package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(
			String[] args) throws IOException {

		new EncryptedFile(
				new CaesarCipher(
						new GuardedPrintMedium(
								new SourceFile(
										"MyLetters.txt")),
						new CipherKey(
								new Scanner(
										System.in)),
						new StringBuilder())).create();

	}
}

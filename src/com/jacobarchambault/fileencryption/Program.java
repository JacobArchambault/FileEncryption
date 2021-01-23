package com.jacobarchambault.fileencryption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(
			String[] args) throws IOException {

		new Foobar(
				new EncryptedFile(
						new FileWriter(
								"Encrypted.txt"),
						new EncryptedText(
								new GuardedPrintMedium(
										new SourceFile(
												"MyLetters.txt")),
								new CipherKey(
										new Scanner(
												System.in)),
								new StringBuilder()))).create();

	}
}

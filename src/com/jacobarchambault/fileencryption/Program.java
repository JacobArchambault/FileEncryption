package com.jacobarchambault.fileencryption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(
			String[] args) throws IOException {

		new EncryptedFile(
				new MyFileWriter(
						new FileWriter(
								"Encrypted.txt"),
						new CaesarCipher(
								new SourceText(
										new GuardedPrintMedium(
												new SourceFile(
														"MyLetters.txt"))),
								new CipherKey(
										new Scanner(
												System.in)),
								new StringBuilder()))).create();

	}
}

package com.jacobarchambault.fileencryption;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(
			String[] args) throws IOException {

		String outfilePath = "Encrypted.txt";
		new EncryptedFile(
				new PrintWriter(
						outfilePath),
				new EncryptedText(
						new GuardedPrintMedium(
								new SourceFile(
										"MyLetters.txt")),
						new CipherKey(
								new Scanner(
										System.in)),
						new StringBuilder())).write();
		System.out.println(
				"Encrypted text stored at " + outfilePath + ". Here you go!");
		Desktop.getDesktop()
				.open(
						new File(
								outfilePath));

	}
}

package com.jacobarchambault.fileencryption;

public class Program {

	public static void main(
			String[] args) {
		new CaesarCipher().encrypt(
				new GuardedPrintMedium(
						new SourceFile(
								"MyLetters.txt")).allText());

	}
}

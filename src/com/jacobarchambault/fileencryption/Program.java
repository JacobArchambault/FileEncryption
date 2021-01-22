package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) throws IOException {
		System.out.println(new CaesarCipher().cipher(new String(
				Files.readAllBytes(Paths.get("MyLetters.txt")))));
	}

}

package com.jacobarchambault.fileencryption;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncryptedFile {

	Cipher cipher;

	EncryptedFile(
			Cipher source) {
		cipher = source;
	}

	void create() throws IOException {
		FileWriter writer = new FileWriter(new File("Encrypted.txt"));
		writer.write(cipher.encrypt());
		writer.close();
		System.out.println(
				"Encrypted text stored in Encrypted.txt. Here you go!");
		Desktop.getDesktop()
				.open(
						new File(
								"Encrypted.txt"));
	}
}

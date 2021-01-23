package com.jacobarchambault.fileencryption;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptedFile {

	Cipher cipher;
	FileWriter writer;

	EncryptedFile(
			Cipher source,
			FileWriter writer) {
		cipher = source;
		this.writer = writer;
	}

	void create() throws IOException {
		writer.write(
				cipher.encrypt());
		writer.close();
		System.out.println(
				"Encrypted text stored in Encrypted.txt. Here you go!");
		Desktop.getDesktop()
				.open(
						new File(
								"Encrypted.txt"));
	}
}

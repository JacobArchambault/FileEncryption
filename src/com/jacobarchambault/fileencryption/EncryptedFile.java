package com.jacobarchambault.fileencryption;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class EncryptedFile {

	MyFileWriter writer;

	EncryptedFile(
			MyFileWriter writer) {
		this.writer = writer;
	}

	void create() throws IOException {
		writer.write();
		System.out.println(
				"Encrypted text stored in Encrypted.txt. Here you go!");
		Desktop.getDesktop()
				.open(
						new File(
								"Encrypted.txt"));
	}
}

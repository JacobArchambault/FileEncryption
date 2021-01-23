package com.jacobarchambault.fileencryption;

import java.io.FileWriter;
import java.io.IOException;

public class EncryptedFile {

	FileWriter writer;
	Cipher cipher;

	EncryptedFile(
			FileWriter writer,
			Cipher cipher) {
		this.writer = writer;
		this.cipher = cipher;
	}

	void write() throws IOException {
		writer.write(
				cipher.encrypt());
		writer.close();

	}
}

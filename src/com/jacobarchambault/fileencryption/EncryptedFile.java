package com.jacobarchambault.fileencryption;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class EncryptedFile {

	Writer writer;
	Cipher cipher;

	EncryptedFile(
			Writer writer,
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

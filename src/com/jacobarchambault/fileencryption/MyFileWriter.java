package com.jacobarchambault.fileencryption;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	FileWriter writer;
	Cipher cipher;

	MyFileWriter(
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

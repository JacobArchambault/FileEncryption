package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SourceFile {

	String filePath;

	SourceFile(
			String filePath) {
		this.filePath = filePath;
	}

	String allText() throws IOException {
		return new String(
				Files.readAllBytes(Paths.get("MyLetters.txt")));
	}
}

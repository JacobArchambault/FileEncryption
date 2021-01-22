package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MyFile {
	String path;

	MyFile(
			String filePath) {
		path = filePath;
	}

	String allText() throws IOException {
		return new String(
				Files.readAllBytes(Paths.get(path)));
	}

}

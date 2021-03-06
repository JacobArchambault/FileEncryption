package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SourceFile implements PrintMedium {

	String filePath;

	SourceFile(
			String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String allText() throws IOException {
		return Files.readString(
				Paths.get(
						filePath));
	}
}

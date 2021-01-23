package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class SourceText {
	PrintMedium medium;
	SourceText(PrintMedium medium) {
		this.medium = medium;
	}
	char[] textAsCharArray() throws IOException {
		return medium.allText()
				.toCharArray();
	}
}

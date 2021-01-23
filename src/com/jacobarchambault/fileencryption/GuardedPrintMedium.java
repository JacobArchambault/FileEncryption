package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class GuardedPrintMedium implements PrintMedium {

	PrintMedium medium;

	GuardedPrintMedium(
			PrintMedium origin) {
		medium = origin;
	}

	@Override
	public String allText() {
		try {
			return medium.allText();
		} catch (IOException e) {
			System.out.println(
					"There was a problem reading the text file: using default text instead");
		}
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	}

}

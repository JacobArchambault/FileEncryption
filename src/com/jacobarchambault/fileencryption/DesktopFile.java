package com.jacobarchambault.fileencryption;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class DesktopFile {
	static void openWithDefaultApp(
			String outfilePath) throws IOException {
		System.out.println(
				"Text stored at " + outfilePath + ". Here you go!");
		Desktop.getDesktop()
				.open(
						new File(
								outfilePath));
	}

}

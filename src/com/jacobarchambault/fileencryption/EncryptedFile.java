package com.jacobarchambault.fileencryption;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncryptedFile {

	Cipher cipher;
	EncryptedFile(Cipher source)
	{
		cipher = source;
	}
	void create() throws IOException{
		Files.writeString(Path.of("Encrypted.txt"), cipher.encrypt());
	}
}

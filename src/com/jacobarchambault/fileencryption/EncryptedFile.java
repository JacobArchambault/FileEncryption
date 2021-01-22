package com.jacobarchambault.fileencryption;

public class EncryptedFile {

	Cipher cipher;
	EncryptedFile(Cipher source)
	{
		cipher = source;
	}
}

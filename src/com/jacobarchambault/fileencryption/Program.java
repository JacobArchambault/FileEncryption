package com.jacobarchambault.fileencryption;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(new CaesarCipher().cipher(new MyFile("MyLetters.txt").allText(), 3));
	}

}

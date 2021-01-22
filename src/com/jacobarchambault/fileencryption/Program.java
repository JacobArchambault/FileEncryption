package com.jacobarchambault.fileencryption;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(new CaesarCipher().cipher(new MyFile(
				"MyLetters.txt").allText(),
				getUserInput()));
	}
	static int getUserInput(){
		System.out.print("Enter an integer for your Caesar Cipher and press enter: ");
		Scanner scanner = new Scanner(System.in);
		int cipher = scanner.nextInt();
		scanner.close();
		return cipher;		
	}

}

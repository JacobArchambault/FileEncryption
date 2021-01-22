package com.jacobarchambault.fileencryption;

public class CaesarCipher {
	String cipher(String message, int offset) {
		
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
		    if (character != ' ') {
		        char newCharacter = (char) ('a' + ((character - 'a' + offset) % 26));
		        result.append(newCharacter);
		    } else {
		        result.append(character);
		    }
		}
		return result.toString();
		
	};
	
}

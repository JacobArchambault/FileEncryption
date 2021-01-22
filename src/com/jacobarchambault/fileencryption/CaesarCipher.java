package com.jacobarchambault.fileencryption;

public class CaesarCipher {
	String cipher(String message, int offset) {
		
		
		StringBuilder builder = new StringBuilder();
		for (char character : message.toCharArray()) {
		    if (character != ' ') {
		        char newCharacter = (char) ('a' + ((character - 'a' + offset) % 26));
		        builder.append(newCharacter);
		    } else {
		        builder.append(character);
		    }
		}
		return builder.toString();
		
	};
	
}

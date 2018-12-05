package ua.com.qalight.service;

import java.util.HashMap;
import java.util.Map;

public class TextManipulator {

	public static Map<String, String> getKeyOne() {

		Map<String, String> keyOne = new HashMap<>();
		keyOne.put("A", "M");
		keyOne.put("B", "N");
		keyOne.put("C", "B");
		keyOne.put("D", "V");
		keyOne.put("E", "C");
		keyOne.put("F", "X");
		keyOne.put("G", "Z");
		keyOne.put("H", "L");
		keyOne.put("I", "K");
		keyOne.put("J", "J");
		keyOne.put("K", "H");
		keyOne.put("L", "G");
		keyOne.put("M", "F");
		keyOne.put("N", "D");
		keyOne.put("O", "S");
		keyOne.put("P", "A");
		keyOne.put("Q", "P");
		keyOne.put("R", "O");
		keyOne.put("S", "I");
		keyOne.put("T", "U");
		keyOne.put("U", "Y");
		keyOne.put("V", "T");
		keyOne.put("W", "R");
		keyOne.put("X", "E");
		keyOne.put("Y", "W");
		keyOne.put("Z", "Q");
		
		return keyOne;
	}

	public static Map<String, String> getKeyTwo() {

		Map<String, String> keyTwo = new HashMap<>();
		keyTwo.put("A", "Z");
		keyTwo.put("B", "Y");
		keyTwo.put("C", "X");
		keyTwo.put("D", "W");
		keyTwo.put("E", "V");
		keyTwo.put("F", "U");
		keyTwo.put("G", "T");
		keyTwo.put("H", "S");
		keyTwo.put("I", "R");
		keyTwo.put("J", "Q");
		keyTwo.put("K", "P");
		keyTwo.put("L", "O");
		keyTwo.put("M", "N");
		keyTwo.put("N", "M");
		keyTwo.put("O", "L");
		keyTwo.put("P", "K");
		keyTwo.put("Q", "J");
		keyTwo.put("R", "I");
		keyTwo.put("S", "H");
		keyTwo.put("T", "G");
		keyTwo.put("U", "F");
		keyTwo.put("V", "E");
		keyTwo.put("W", "D");
		keyTwo.put("X", "C");
		keyTwo.put("Y", "B");
		keyTwo.put("Z", "A");
		
		return keyTwo;
	}

	public static String modifyText(String text) { 
		
		String modifiedText = text.replaceAll("[^a-zA-Z]", "");
		modifiedText = modifiedText.toUpperCase();
		return modifiedText;
	}

	public static String encodeText(String text) {
		String out = "";
		
		char[] symbols = text.toCharArray();
		
		for (int i = 0; i < symbols.length; i++) {
			char symbol = symbols[i];
			if(i%2 == 0) {
				out += getKeyOne().get(String.valueOf(symbol));
			} 
			else {
				out += getKeyTwo().get(String.valueOf(symbol));
			}
		}
		return out;
	}
}

package com.statestr;

public class StringReverse {

	public static void main(String[] args) {

		String stringStr= "thiru";
		System.out.println("Original String is " + stringStr);
		System.out.println("Reversed String is: " + new StringReverse().reverseString(stringStr));
	}

	private String reverseString(String str) {
		int length = str.length();
		char[] chars = new char[str.length()];
		int i;

		
		for (i = length - 1; i >= 0; i--) {
			chars[length - 1 - i] = str.charAt(i);
		}

		return new String(chars);

	}

}
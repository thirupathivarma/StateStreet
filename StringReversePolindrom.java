package com.statestr;

public class StringReversePolindrom {

	public static void main(String[] args) {

		String stringStr = "aba";
		System.out.println("Original String is " + stringStr);
		System.out.println("Reversed String is: " + new StringReversePolindrom().reverseString(stringStr));
		System.out.println("Polindrom Check " + polindromCheck(stringStr));
	}

	public static String reverseString(String str) {
		int length = str.length();
		char[] chars = new char[str.length()];
		int i;
		for (i = length - 1; i >= 0; i--) {
			chars[length - 1 - i] = str.charAt(i);
		}
		return new String(chars);

	}

	public static boolean polindromCheck(String str) {
		if (reverseString(str).equals(str)) {
			return true;
		}
		return false;
	}
}
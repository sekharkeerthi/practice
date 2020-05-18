package com.sk.string;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class StringRepresentaion {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String germanString = "Entwickeln Sie mit Vergnügen";
		byte[] germanBytes = germanString.getBytes("UTF-8");

		String asciiEncodedString = new String(germanBytes);
		
		System.out.println(asciiEncodedString);
		
		
		String englishString = "Develop with pleasure";
		byte[] englishBytes = englishString.getBytes();
		 
		String asciiEncondedEnglishString = new String(englishBytes, StandardCharsets.US_ASCII);
		
		System.out.println(asciiEncondedEnglishString);

	}

}

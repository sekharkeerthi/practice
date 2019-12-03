package com.sk.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class TryCatchResource {

	public static void main(String[] args) throws IOException {

		for (Character c = 'a'; c <= 'z'; c++) {
			System.out.println(Character.toUpperCase(c));
		}

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sekhark\\Desktop\\Gopi_Query.txt"));
				java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(
						FileSystems.getDefault().getPath("C:\\\\Users\\\\sekhark\\\\Desktop\\\\Gopi_Query_1.txt"),
						Charset.defaultCharset())) {

		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader br = null;
		java.io.BufferedWriter writer = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\sekhark\\Desktop\\Gopi_Query.txt"));
			writer = java.nio.file.Files.newBufferedWriter(
					FileSystems.getDefault().getPath("C:\\\\Users\\\\sekhark\\\\Desktop\\\\Gopi_Query_1.txt"),
					Charset.defaultCharset());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				br.close();
			if (writer != null)
				writer.close();
		}
	}
}

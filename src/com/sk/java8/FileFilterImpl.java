package com.sk.java8;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl {

	public static void main(String[] args) {
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			}
		};

		File file = new File("D:\\Workspaces_Latest\\Tuscany_API\\Test\\src\\com\\sk\\java8");
		File[] files = file.listFiles(fileFilter);
		for (File file2 : files) {
			// System.out.println(file2);
		}

		FileFilter fileFilterLambda = (File f) -> f.getName().endsWith(".java");
		File[] filesLambda = file.listFiles(fileFilterLambda);
		for (File file3 : files) {
			System.out.println(file3);
		}
	}
}

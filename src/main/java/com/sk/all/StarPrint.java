package com.sk.all;

import java.sql.SQLException;

public class StarPrint {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

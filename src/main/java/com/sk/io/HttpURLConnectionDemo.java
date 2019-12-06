package com.sk.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		System.out.println("Response code is:  " + con.getResponseCode());
		System.out.println(con.getResponseMessage());
		String inputLine;
		System.out.println("Response Body:");
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		in.close();
	}
}

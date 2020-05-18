package com.sk.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleDemo {

	public static void main(String[] args) {
		Locale locale = new Locale("de", "DE"); //no bundle for German -> default
		ResourceBundle bundle = ResourceBundle.getBundle("com.sk.resourcebundle.MyClassBundle", locale);

		System.out.println("price   : " + bundle.getObject("price"));
		System.out.println("currency: " + bundle.getObject("currency"));


		locale = new Locale("da", "DK");
		bundle = ResourceBundle.getBundle("com.sk.resourcebundle.MyClassBundle", locale);

		System.out.println("price   : " + bundle.getObject("price"));
		System.out.println("currency: " + bundle.getObject("currency"));
		
		System.out.println(Locale.getDefault());

	}

}

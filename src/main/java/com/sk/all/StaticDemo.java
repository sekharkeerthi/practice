package com.sk.all;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StaticDemo {

	static int i;
	Integer j;

	public static void main(String[] args) throws ParseException {
		System.out.println(new Date());

		Calendar lastMonth = Calendar.getInstance();
		lastMonth.setTime(new Date());
		lastMonth.set(Calendar.DATE, -1);

		System.out.println(lastMonth.getTime());
		System.out.println(lastMonth.get(Calendar.DATE));

		Date myDate = new Date();
		System.out.println(myDate);
		String s = new SimpleDateFormat("MM/dd/yyyy").format(myDate);
		System.out.println(s);
		System.out.println(new SimpleDateFormat("MM/dd/yyyy").parse(s));

		System.out.println(args[0]);
		String empty = "";
		System.out.println(empty.hashCode());
		String scat = 40 + 30 + "abc" + 40 + 30;
		System.out.println(40 + 30);
		System.out.println(scat);
		StaticDemo sd = null;
		System.out.println(sd.i);
		sd = new StaticDemo();
		System.out.println(sd.j);
		int z;

	}

}

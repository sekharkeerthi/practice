package com.sk.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalculations {

	public static void main(String[] args) {

		String myInputDate = "20120129";

		String myFutureDate = addDays(myInputDate, "30");
		System.out.println(myFutureDate);

		/*
		 * String myPastDate = subtractDays(myInputDate, "30");
		 * System.out.println(myPastDate);
		 */

	}

	private static String addDays(String fromDate, String days) {

		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		try {
			Date myDate = df.parse(fromDate.trim());
			c.setTime(myDate);
			c.add(Calendar.DATE, Integer.parseInt(days));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String toDate = df.format(c.getTime());
		return toDate;

	}

	private static String subtractDays(String fromDate, String days) {

		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		try {
			Date myDate = df.parse(fromDate.trim());
			c.setTime(myDate);
			c.add(Calendar.DATE, (Integer.parseInt(days) * -1));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String toDate = df.format(c.getTime());
		return toDate;

	}

}
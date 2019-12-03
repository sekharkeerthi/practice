package com.sk.all;

import java.util.Calendar;
import java.util.Date;

public class MonthsAndDaysCalculation {
	public static String getDateDifferenceInDDMMYYYY(Date from, Date to) {
		Calendar fromDate = Calendar.getInstance();
		Calendar toDate = Calendar.getInstance();
		fromDate.setTime(from);
		toDate.setTime(to);
		int increment = 0;
		int year, month, day;
		System.out.println(fromDate.getActualMaximum(Calendar.DAY_OF_MONTH));
		if (fromDate.get(Calendar.DAY_OF_MONTH) > toDate.get(Calendar.DAY_OF_MONTH)) {
			increment = fromDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		System.out.println("increment" + increment);
		// DAY CALCULATION
		if (increment != 0) {
			day = (toDate.get(Calendar.DAY_OF_MONTH) + increment) - fromDate.get(Calendar.DAY_OF_MONTH);
			increment = 1;
		} else {
			day = toDate.get(Calendar.DAY_OF_MONTH) - fromDate.get(Calendar.DAY_OF_MONTH);
		}

		// MONTH CALCULATION
		if ((fromDate.get(Calendar.MONTH) + increment) > toDate.get(Calendar.MONTH)) {
			month = (toDate.get(Calendar.MONTH) + 12) - (fromDate.get(Calendar.MONTH) + increment);
			increment = 1;
		} else {
			month = (toDate.get(Calendar.MONTH)) - (fromDate.get(Calendar.MONTH) + increment);
			increment = 0;
		}

		// YEAR CALCULATION
		year = toDate.get(Calendar.YEAR) - (fromDate.get(Calendar.YEAR) + increment);
		return year + "\tYears\t\t" + month + "\tMonths\t\t" + day + "\tDays";
	}

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 04, 01);
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2019, 07, 13);
		System.out.println(getDateDifferenceInDDMMYYYY(calendar.getTime(), calendar1.getTime()));
	}
}

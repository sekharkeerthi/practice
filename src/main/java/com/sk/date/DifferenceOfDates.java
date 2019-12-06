package com.sk.date;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceOfDates {
	public static void main(String[] args) {
		LocalDate sDate = LocalDate.of(2019, 04, 01);
		LocalDate eDate = LocalDate.of(2019, 07, 13).plusDays(1);

		Period diff = Period.between(sDate, eDate);

		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}
}
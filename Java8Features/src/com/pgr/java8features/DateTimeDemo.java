package com.pgr.java8features;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		LocalDate localDate = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localDate);

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
				FormatStyle.SHORT);
		// localDateTime.format(dateTimeFormatter);
		dateTimeFormatter.format(localDateTime);
		System.out.println(localDateTime);

		// SimpleDateFormat format = new SimpleDateFormat("MMM/dd/YYYY ");//08/07/2023
		// 07/08/2023

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss zz");

		String dateStr = format.format(date);

		System.out.println(dateStr);
	}
}

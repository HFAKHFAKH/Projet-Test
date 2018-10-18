package com.example.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatUtil {
	/** the date format pattern. */
	public static final String DATE_FORMAT_PATTERN = "dd/MM/yyyy";
	public static final String DATE_FORMAT_PATTERN_MVT = "ddMMyyyy";
	public static final String TIMESTAMP_FORMAT_PATTERN = "HH:mm:ss";
	public static final String DATE_TIMESTAMP_FORMAT_PATTERN = "dd/MM/yyyy HH:mm:ss";

	private static DateFormat dateTimeFormat = new SimpleDateFormat(DateFormatUtil.DATE_TIMESTAMP_FORMAT_PATTERN,
			Locale.getDefault());

	private static DateFormat dateFormat = new SimpleDateFormat(DateFormatUtil.DATE_FORMAT_PATTERN,
			Locale.getDefault());

	private static DateFormat timeFormat = new SimpleDateFormat(DateFormatUtil.TIMESTAMP_FORMAT_PATTERN,
			Locale.getDefault());

	/**
	 * private constructor to prevent instanciation.
	 */
	private DateFormatUtil() {
	}

	/**
	 * Get the date object represented by given string.
	 *
	 * @param text the string to parse as a date
	 * @return the date constructed from the given string
	 * @throws ParseException the parse exception
	 */
	public static Calendar parseTime(final String text) {
		/* Cannnot use static DateFormat since it is not thread safe */
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		try {
			cal.setTime(timeFormat.parse(text));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return cal;
	}

	/**
	 * Get the string representation of given date.
	 *
	 * @param date the date to represent
	 * @return the string representing the given date
	 */
	public static String formatTime(final Date date) {
		/* Cannnot use static DateFormat since it is not thread safe */
		return timeFormat.format(date);
	}

	/**
	 * Get the string representation of given date.
	 *
	 * @param date the date to represent
	 * @return the string representing the given date
	 */
	public static String formatDate(final Date date) {
		/* Cannnot use static DateFormat since it is not thread safe */
		return dateFormat.format(date);
	}

	/**
	 * Get the date object represented by given string.
	 *
	 * @param text the string to parse as a date
	 * @return the date constructed from the given string
	 * @throws ParseException the parse exception
	 */
	public static Date parseDate(final String text) {
		/* Cannnot use static DateFormat since it is not thread safe */
		try {
			return dateFormat.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Get the string representation of given date.
	 *
	 * @param date the date to represent
	 * @return the string representing the given date
	 */
	public static String formatDateTime(final Calendar date) {
		/* Cannnot use static DateFormat since it is not thread safe */
		return dateTimeFormat.format(date.getTime());
	}

	/**
	 * Get the date object represented by given string.
	 *
	 * @param text the string to parse as a date
	 * @return the date constructed from the given string
	 * @throws ParseException the parse exception
	 */
	public static Calendar parseDateTime(final String text) {
		/* Cannnot use static DateFormat since it is not thread safe */
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		try {
			cal.setTime(dateTimeFormat.parse(text));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return cal;
	}
}

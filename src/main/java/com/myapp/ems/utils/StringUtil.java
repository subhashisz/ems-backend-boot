package com.myapp.ems.utils;

public class StringUtil {

	public static boolean isBlankString(String string) {
		return string == null || string.trim().isEmpty();
	}

	public static boolean isEmptyString(String string) {
		return string == null || string.isEmpty();
	}
}

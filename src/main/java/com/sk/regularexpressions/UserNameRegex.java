package com.sk.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameRegex {
	public static final String PATTERN = "^[a-zA-Z][a-zA-Z0-9._-]{0,15}[a-zA-Z0-9]$";
	public static final Pattern p = Pattern.compile(PATTERN);

	public static boolean apply(String userName) {
		Matcher matcher = p.matcher(userName);
		return matcher.find();
	}
}

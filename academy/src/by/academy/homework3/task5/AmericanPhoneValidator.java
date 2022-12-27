/*
 * Homework #3
 * Task #5
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.task5;

import java.util.regex.Pattern;

/**
 * Validator for validation american phone numbers
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class AmericanPhoneValidator implements Validator {

	private final Pattern p = Pattern.compile("\\+1\\d{10}");

	public AmericanPhoneValidator() {
		super();
	}

	@Override
	public Pattern getPattern() {
		return p;
	}
}

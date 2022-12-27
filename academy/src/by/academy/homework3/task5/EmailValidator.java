/*
 * Homework #3
 * Task #5
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.task5;

import java.util.regex.Pattern;

/**
 * Validator for validation emails
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class EmailValidator implements Validator {

	private final Pattern p = Pattern.compile("[\\w\\-.]+@[a-zA-z0-9\\-.]{2,}\\.[a-zA-z]{2,}");

	public EmailValidator() {
		super();
	}

	@Override
	public Pattern getPattern() {
		return p;
	}
}

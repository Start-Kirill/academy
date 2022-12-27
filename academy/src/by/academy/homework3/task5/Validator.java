/*
 * Homework #3
 * Task #5
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.task5;

import java.util.regex.Pattern;

/**
 * Interface for validation strings
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public interface Validator {

	Pattern getPattern();

	default boolean validate(String string) {
		return getPattern().matcher(string).matches();
	}
}

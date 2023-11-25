package menu.util;

import java.util.Arrays;
import java.util.List;

import output.ErrorMessagePrinter;

public class InputTransducer {

	private static final String SEPARATOR = ",";

	public static List<String> toList(String input) {
		validateFormat(input);

		return Arrays.stream(input.split(SEPARATOR))
			.map(String::trim)
			.toList();
	}

	private static void validateFormat(String input) {
		if(!input.isBlank() && !input.contains(SEPARATOR)) {
			ErrorMessagePrinter.printInputFormatError();
			throw new IllegalArgumentException();
		}
	}

}

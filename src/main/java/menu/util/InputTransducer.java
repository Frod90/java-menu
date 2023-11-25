package menu.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import output.ErrorMessagePrinter;

public class InputTransducer {

	private static final String SEPARATOR = ",";

	public static List<String> toList(String input) {

		return Arrays.stream(input.split(SEPARATOR))
			.map(String::trim)
			.collect(Collectors.toList());
	}

}

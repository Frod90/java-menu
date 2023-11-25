package menu.controller;

import java.util.ArrayList;
import java.util.List;

import menu.input.InputMachine;
import menu.util.InputTransducer;
import output.ErrorMessagePrinter;

public class UserNameController {

	List<String> userNames = new ArrayList<>();

	public List<String> makeCorrect() {

		boolean errorSign;

		do{
			errorSign = hasError();
		}while(errorSign);

		return userNames;
	}

	private boolean hasError() {

		try{
			String inputUserNames = InputMachine.inputUserName();
			userNames = InputTransducer.toList(inputUserNames);

			validateUserName(userNames);

		}catch (IllegalArgumentException illegalArgumentException) {
			return true;
		}

		return false;
	}

	private void validateUserName(List<String> userNames) {

		for(String eachName : userNames) {
			validateUserNameLength(eachName);
		}

		validateUserNamesMinSize(userNames);
		validateUserNamesMaxSize(userNames);
	}

	private void validateUserNameLength(String userName) {

		int userNameLength = userName.length();

		if(userNameLength < 2 || 4 < userNameLength) {
			ErrorMessagePrinter.printUserNameLengthError();
			throw new IllegalArgumentException();
		}
	}

	private void validateUserNamesMinSize(List<String> userNames) {

		int userNameSize = userNames.size();

		if(userNameSize < 2) {
			ErrorMessagePrinter.printUserNameMinSizeError();
			throw new IllegalArgumentException();
		}
	}

	private void validateUserNamesMaxSize(List<String> userNames) {

		int userNameSize = userNames.size();

		if (5 < userNameSize) {
			ErrorMessagePrinter.printUserNameMaxSizeError();
			throw new IllegalArgumentException();
		}
	}


}

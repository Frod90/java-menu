package menu.controller;

import java.util.ArrayList;
import java.util.List;

import menu.domain.Recommend;
import menu.input.InputMachine;
import menu.util.InputTransducer;
import output.ErrorMessagePrinter;

public class RecommendMakeController {

	List<Recommend> recommends = new ArrayList<>();

	public List<Recommend> makeCorrect(List<String> userNames) {

		for(String eachUserName : userNames) {

			boolean errorSign;

			do{
				errorSign = hasError(eachUserName);

			} while (errorSign);
		}

		return recommends;
	}

	private boolean hasError(String userName) {

		try{
			String inputDislikeMenu = InputMachine.inputDislikeMenu(userName);
			List<String> dislikeMenu = InputTransducer.toList(inputDislikeMenu);

			Recommend recommend = new Recommend(userName, dislikeMenu);
			recommends.add(recommend);

		}catch (IllegalArgumentException illegalArgumentException) {
			ErrorMessagePrinter.printDislikeMenuSizeError();
			return true;
		}

		return false;
	}

}

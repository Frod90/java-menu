package menu.controller;

import java.util.ArrayList;
import java.util.List;

import menu.domain.RecommendMenu;
import menu.input.InputMachine;
import menu.util.InputTransducer;
import output.ErrorMessagePrinter;

public class RecommendMenusMakeController {

	List<RecommendMenu> recommendMenus = new ArrayList<>();

	public List<RecommendMenu> makeCorrect(List<String> userNames) {

		for(String eachUserName : userNames) {

			boolean errorSign;

			do{
				errorSign = hasError(eachUserName);

			} while (errorSign);
		}

		return recommendMenus;
	}

	private boolean hasError(String userName) {

		try{
			String inputDislikeMenu = InputMachine.inputDislikeMenu(userName);
			List<String> dislikeMenu = InputTransducer.toList(inputDislikeMenu);

			RecommendMenu recommendMenu = new RecommendMenu(userName, dislikeMenu);
			recommendMenus.add(recommendMenu);

		}catch (IllegalArgumentException illegalArgumentException) {
			ErrorMessagePrinter.printDislikeMenuSizeError();
			return true;
		}

		return false;
	}

}

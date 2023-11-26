package menu.controller;

import java.util.ArrayList;
import java.util.List;

import menu.domain.CategoryGenerator;
import menu.domain.RecommendMenu;
import output.ResultPrinter;

public class RecommendController {

	List<String> userNames = new ArrayList<>();
	List<String> categorys = new ArrayList<>();
	List<RecommendMenu> recommendMenus = new ArrayList<>();

	UserNameController userNameController = new UserNameController();
	RecommendMenusMakeController recommendMenusMakeController = new RecommendMenusMakeController();

	public void run() {
		ResultPrinter.printStartMessage();

		recommendWeekMenu();

		ResultPrinter.printResultMessage();
		ResultPrinter.printDay();
		ResultPrinter.printCategory(categorys);

		for (RecommendMenu eachRecommendMenu : recommendMenus) {
			ResultPrinter.printRecommendMenu(eachRecommendMenu);
		}

		ResultPrinter.printEndMessage();
	}

	private void recommendWeekMenu() {

		userNames = userNameController.makeCorrect();
		recommendMenus = recommendMenusMakeController.makeCorrect(userNames);

		for (int i = 0; i < 5; i++) {
			conductDay();
		}
	}

	private void conductDay() {

		String category = CategoryGenerator.generate(categorys);
		categorys.add(category);

		for (RecommendMenu eachRecommendMenu : recommendMenus) {
			eachRecommendMenu.generateCorrectMenu(category);
		}

	}

}

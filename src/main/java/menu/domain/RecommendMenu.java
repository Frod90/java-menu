package menu.domain;

import java.util.ArrayList;
import java.util.List;

import menu.constant.DefaultMenu;

public class RecommendMenu {

	String userName;
	List<String> dislikeMenu;
	List<String> menus = new ArrayList<>();

	public RecommendMenu(String userName, List<String> dislikeMenu) {
		this.userName = userName;

		validateDislikeMenuSize(dislikeMenu);

		if (!dislikeMenu.get(0).isBlank()) {
			validateDislikeMenu(dislikeMenu);
		}

		this.dislikeMenu = dislikeMenu;
	}

	private void validateDislikeMenuSize(List<String> dislikeMenu) {
		if (2 < dislikeMenu.size()) {
			throw new IllegalArgumentException();
		}
	}

	private void validateDislikeMenu(List<String> dislikeMenu) {

		for (String eachDislikeMenu : dislikeMenu) {
			String category = matchDefaultMenu(eachDislikeMenu);

			if (category.isBlank()) {
				throw new IllegalArgumentException();
			}
		}
	}

	private String matchDefaultMenu(String menu) {

		String category = "";

		for (DefaultMenu defaultMenu : DefaultMenu.values()) {

			List<String> defaultMenuDetails = defaultMenu.getDetails();

			if (defaultMenuDetails.contains(menu)) {
				category = defaultMenu.getCategory();
			}
		}

		return category;
	}

	public void generateCorrectMenu(String category) {

		String menu = "";

		while (menu.isBlank()) {

			menu = RecommendMenuGenerator.generate(category);

			if (menus.contains(menu)) {
				menu = "";
			}
		}

		menus.add(menu);
	}

	public String toString() {
		return String.format(
			"[ %s | %s | %s | %s | %s | %s ]",
			userName,
			menus.get(0),
			menus.get(1),
			menus.get(2),
			menus.get(3),
			menus.get(4)
		);
	}

}

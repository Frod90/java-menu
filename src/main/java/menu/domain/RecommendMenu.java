package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class RecommendMenu {

	String userName;
	List<String> dislikeMenu;
	List<String> menus = new ArrayList<>();

	public RecommendMenu(String userName, List<String> dislikeMenu) {
		this.userName = userName;

		validateDislikeMenuSize(dislikeMenu);
		this.dislikeMenu = dislikeMenu;

	}

	private void validateDislikeMenuSize(List<String> dislikeMenu) {
		if (2 < dislikeMenu.size()) {
			throw new IllegalArgumentException();
		}
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

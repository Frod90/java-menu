package menu.domain;

import java.util.List;

public class Recommend {

	String userName;
	List<String> dislikeMenu;
	List<String> menus;

	public Recommend(String userName, List<String> dislikeMenu) {
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

	public String getUserName() {
		return userName;
	}

	public List<String> getDislikeMenu() {
		return dislikeMenu;
	}

	public List<String> getMenus() {
		return menus;
	}

}
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

	public String getUserName() {
		return userName;
	}

	public List<String> getDislikeMenu() {
		return dislikeMenu;
	}

}

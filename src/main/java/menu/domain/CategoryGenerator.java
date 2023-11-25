package menu.domain;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.DefaultMenu;

public class CategoryGenerator {

	public static String generate(List<String> categorys) {

		int categorySign = generateCategorySign();
		return findCategory(categorySign);
	}

	private static int generateCategorySign() {
		return Randoms.pickNumberInRange(1,5);
	}

	private static String findCategory(int categorySign) {

		String category = "";

		for(DefaultMenu eachDefaultMenu : DefaultMenu.values()) {

			if(eachDefaultMenu.getCategorySign() == categorySign) {
				category = eachDefaultMenu.getCategory();
			}
		}

		return category;
	}


}

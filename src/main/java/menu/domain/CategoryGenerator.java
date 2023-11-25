package menu.domain;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.DefaultMenu;

public class CategoryGenerator {

	public static String generate(List<String> categorys) {

		long categoryCount;
		String category;

		do {
			int categorySign = generateCategorySign();
			category = findCategory(categorySign);
			categoryCount = calculateCategoryCount(categorys, category);

		} while (2 <= categoryCount);

		return category;
	}

	public static long calculateCategoryCount(List<String> categorys, String category) {

		return categorys.stream()
			.filter(i -> i.equals(category))
			.count();
	}

	private static int generateCategorySign() {
		return Randoms.pickNumberInRange(1, 5);
	}

	private static String findCategory(int categorySign) {

		String category = "";

		for (DefaultMenu eachDefaultMenu : DefaultMenu.values()) {

			if (eachDefaultMenu.getCategorySign() == categorySign) {
				category = eachDefaultMenu.getCategory();
			}
		}

		return category;
	}

}

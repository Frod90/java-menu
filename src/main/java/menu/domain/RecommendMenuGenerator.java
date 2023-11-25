package menu.domain;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.DefaultMenu;

public class RecommendMenuGenerator {

	public static String generate(String category) {

		List<String> defaultMenuDetails = findDefaultMenuDetails(category);

		return Randoms.shuffle(defaultMenuDetails).get(0);

	}

	private static List<String> findDefaultMenuDetails(String category) {

		List<String> defaultMenuDetails = new ArrayList<>();

		for(DefaultMenu eachDefaultMenu : DefaultMenu.values()) {

			if(eachDefaultMenu.getCategory().equals(category)) {
				defaultMenuDetails = eachDefaultMenu.getDetails();
			}
		}

		return defaultMenuDetails;
	}


}

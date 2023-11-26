package output;

import java.util.List;

import menu.domain.RecommendMenu;

public class ResultPrinter {

	public static void printStartMessage() {
		System.out.println("점심 메뉴 추천을 시작합니다.");
	}

	public static void printResultMessage() {
		System.out.println();
		System.out.println("메뉴 추천 결과입니다.");
	}

	public static void printDay() {
		System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
	}

	public static void printCategory(List<String> categorys) {
		System.out.printf(
			"[ 카테고리 | %s | %s | %s | %s | %s ]\n",
			categorys.get(0),
			categorys.get(1),
			categorys.get(2),
			categorys.get(3),
			categorys.get(4)
		);
	}

	public static void printRecommendMenu(RecommendMenu recommendMenu) {
		System.out.println(recommendMenu);
	}

	public static void printEndMessage() {
		System.out.println();
		System.out.println("추천을 완료했습니다.");
	}


}

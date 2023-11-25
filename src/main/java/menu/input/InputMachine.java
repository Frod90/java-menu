package menu.input;

import camp.nextstep.edu.missionutils.Console;

public class InputMachine {

	private static final String INPUT_USER_NAME_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";
	private static final String INPUT_DISLIKE_MENU_FORMAT = "%s(이)가 못 먹는 메뉴를 입력해 주세요.";

	public static String inputUserName() {
		System.out.println();
		System.out.println(INPUT_USER_NAME_MESSAGE);
		return Console.readLine();
	}

	public static String inputDislikeMenu(String userName) {
		System.out.println();
		System.out.printf(INPUT_DISLIKE_MENU_FORMAT, userName);
		return Console.readLine();
	}
}

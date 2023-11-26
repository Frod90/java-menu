package output;

public class ErrorMessagePrinter {

	private static final String ERROR_MESSAGE = "[ERROR] ";
	private static final String INPUT_FORMAT_ERROR_MESSAGE = "구분자(,)를 이용해 나눠주세요";
	private static final String USER_NAME_LENGTH_ERROR_MESSAGE = "코치의 이름은 최소 2글자 이상 최대 4글자 이하만 입력해야 합니다";
	private static final String USER_NAME_MIN_SIZE_ERROR_MESSAGE = "코치는 최소 2명 이상 입력해야 합니다.";
	private static final String USER_NAME_MAX_SIZE_ERROR_MESSAGE = "코치는 최소 5명 이하 입력해야 합니다.";
	private static final String DISLIKE_MENU_SIZE_ERROR_MESSAGE = "메뉴 목록에 존재하는 최소 0개, 최대 2개의 못 먹는 메뉴를 구분자(,)로 구분해서 입력해 주세요.";

	public static void printInputFormatError() {
		System.out.println(ERROR_MESSAGE + INPUT_FORMAT_ERROR_MESSAGE);
	}

	public static void printUserNameLengthError() {
		System.out.println(ERROR_MESSAGE + USER_NAME_LENGTH_ERROR_MESSAGE);
	}

	public static void printUserNameMinSizeError() {
		System.out.println(ERROR_MESSAGE + USER_NAME_MIN_SIZE_ERROR_MESSAGE);
	}

	public static void printUserNameMaxSizeError() {
		System.out.println(ERROR_MESSAGE + USER_NAME_MAX_SIZE_ERROR_MESSAGE);
	}

	public static void printDislikeMenuSizeError() {
		System.out.println(ERROR_MESSAGE + DISLIKE_MENU_SIZE_ERROR_MESSAGE);
	}


}

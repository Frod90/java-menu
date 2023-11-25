package output;

public class ErrorMessagePrinter {

	private static final String ERROR_MESSAGE = "[ERROR] ";
	private static final String INPUT_FORMAT_ERROR_MESSAGE = "구분자(,)를 이용해 나눠주세요";
	private static final String USER_NAME_LENGTH_ERROR_MESSAGE = "코치의 이름은 최소 2글자 이상 최대 4글자 이하만 입력해야 합니다";
	private static final String USER_NAME_MIN_SIZE_ERROR_MESSAGE = "코치는 최소 2명 이상 입력해야 합니다.";
	private static final String USER_NAME_MAX_SIZE_ERROR_MESSAGE = "코치는 최소 5명 이하 입력해야 합니다.";
	private static final String DISLIKE_MENU_SIZE_ERROR_MESSAGE = "먹지 못하는 메뉴는 최대 2개까지만 입력 가능합니다.";

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

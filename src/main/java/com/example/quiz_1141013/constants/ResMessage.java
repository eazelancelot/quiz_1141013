package com.example.quiz_1141013.constants;

public enum ResMessage {

	SUCCESS(200, "Success!!"), //
	PLEASE_LOGIN_FIRST(400, "Please login first!!"),//
	DATE_ERROR(400, "Date error!!"),//
	TYPE_ERROR(400, "Type error!!"),//
	OPTIONS_SIZE_ERROR(400, "Options size error!!"),//
	QUIZ_ID_MISMATCH(400, "Quiz id mismatch!!"),//
	QUIZ_NOT_FOUND(404, "Quiz not found!!"),//
	QUESTION_NOT_FOUND(404, "Question not found!!"),//
	OPTION_NAME_MISMATCH(400, "Option name mismatch!!"),//
	ANSWER_REQUIRED(400, "Answer required!!");

	private int code;

	private String message;

	private ResMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

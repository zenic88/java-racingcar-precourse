package com.zenic88.racing;

public class Count {
	private final int count;

	public Count(String number) {
		try {
			count = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("숫자만 입력 가능합니다. 입력값 : {" + number + "}");
		}
	}

	public int getCount() {
		return count;
	}
}

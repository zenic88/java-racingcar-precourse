package com.zenic88.racing;

public class CarName {
	private final String name;

	public CarName(String name) {
		validation(name);
		this.name = name;
	}

	private void validation(String name) {
		if (name == null) {
			throw new IllegalArgumentException("이름은 필수값입니다.");
		}
		name = name.trim();
		if (name.equals("") || name.length() > 5) {
			throw new IllegalArgumentException("이름은 빈칸을 제외한 5자 이하로 지정해주세요.");
		}
	}

	public String getName() {
		return this.name;
	}
}

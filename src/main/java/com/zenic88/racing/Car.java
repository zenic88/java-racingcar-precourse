package com.zenic88.racing;

public class Car {
	private final static int MOVE_MIN = 4;
	private final static int MOVE_MAX = 9;

	private final String name;
	private int position;

	public Car(String carName) {
		this.name = carName;
	}

	public String getName() {
		return this.name;
	}

	public void move() {
		this.position++;
	}

	public int getPosition() {
		return this.position;
	}

	public boolean isCanMove(int number) {
		return number >= MOVE_MIN && number <= MOVE_MAX;
	}
}

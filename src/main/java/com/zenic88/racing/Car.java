package com.zenic88.racing;

public class Car {
	private final static int MOVE_MIN = 4;
	private final static int MOVE_MAX = 9;

	private final CarName name;
	private final Position position;

	public Car(String carName) {
		this.name = new CarName(carName);
		this.position = new Position();
	}

	public String getName() {
		return name.getName();
	}

	public void move() {
		position.move();
	}

	public int getPosition() {
		return position.getPosition();
	}

	public boolean isCanMove(int number) {
		return number >= MOVE_MIN && number <= MOVE_MAX;
	}
}

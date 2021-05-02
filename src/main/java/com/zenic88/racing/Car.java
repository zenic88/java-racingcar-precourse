package com.zenic88.racing;

public class Car {

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
}

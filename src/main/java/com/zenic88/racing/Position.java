package com.zenic88.racing;

public class Position {
	private int position = 0;

	public void move() {
		this.position++;
	}

	public int getPosition() {
		return this.position;
	}
}

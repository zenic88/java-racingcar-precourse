package com.zenic88.racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final static int MIN_CAR = 2;

	public final List<Car> cars = new ArrayList<>();

	public Cars(String carNames) {
		validation(carNames);
		for (String carName : carNames.split(",")) {
			cars.add(new Car(carName));
		}
	}

	public String getWinner() {
		int maxPosition = getMaxPosition();
		List<String> winnerList = new ArrayList<>();
		for (Car car : cars) {
			getWinnerName(car, maxPosition, winnerList);
		}
		return String.join(",", winnerList);
	}

	public void printPosition() {
		for (Car car : cars) {
			car.printPosition();
		}
		System.out.println();
	}

	public void move() {
		for (Car car : cars) {
			randomMove(car);
		}
	}

	public int getSize() {
		return cars.size();
	}

	private void randomMove(Car car) {
		int randomNumber = (int)(Math.random() * 10);
		if (car.isCanMove(randomNumber)) {
			car.move();
		}
	}

	private void validation(String carNames) {
		if (carNames.split(",").length < MIN_CAR) {
			throw new IllegalArgumentException("레이싱을 할 차량이 2대 이상 필요합니다.");
		}
	}

	private void getWinnerName(Car car, int maxPosition, List<String> winnerList) {
		if (car.getPosition() == maxPosition) {
			winnerList.add(car.getName());
		}
	}

	private int getMaxPosition() {
		int maxPosition = 0;
		for (Car car : cars) {
			maxPosition = comparePosition(car, maxPosition);
		}
		return maxPosition;
	}

	private int comparePosition(Car car, int maxPosition) {
		return Math.max(car.getPosition(), maxPosition);
	}

}

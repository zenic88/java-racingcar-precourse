package com.zenic88.racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public void start() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String names = bufferedReader.readLine();
		Cars cars = new Cars(names);

		System.out.println("시도할 회수는 몇회인가요?");
		String inputCount = bufferedReader.readLine();
		randomMove(cars, inputCount);

		System.out.println(cars.getWinner() + "가 최종 우승했습니다.");
	}

	private void randomMove(Cars cars, String inputCount) {
		int count;
		try {
			count = Integer.parseInt(inputCount);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("숫자만 입력 가능합니다. 입력값 : {" + inputCount + "}");
		}

		for (int i = 0; i < count; i++) {
			cars.move();
			cars.printPosition();
		}
	}

}

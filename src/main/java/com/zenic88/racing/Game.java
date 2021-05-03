package com.zenic88.racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public void start() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		Cars cars = new Cars(bufferedReader.readLine());

		System.out.println("시도할 회수는 몇회인가요?");
		randomMove(cars, new Count(bufferedReader.readLine()));

		System.out.println(cars.getWinner() + "가 최종 우승했습니다.");
	}

	private void randomMove(Cars cars, Count count) {
		for (int i = 0; i < count.getCount(); i++) {
			cars.move();
			cars.printPosition();
		}
	}

}

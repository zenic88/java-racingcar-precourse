package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	Car car;
	String carName;

	@BeforeEach
	void setUp() {
		carName = "car1";
		car = new Car(carName);
	}

	@Test
	@DisplayName("한 칸 이동 테스트")
	void moveCarTest() {
		car.move();

		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	@DisplayName("자동차 객체 생성 테스트")
	void createCarTest() {

		assertThat(car.getName()).isEqualTo(carName);
	}
}

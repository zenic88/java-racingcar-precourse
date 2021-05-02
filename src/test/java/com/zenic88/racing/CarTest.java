package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void createCarTest() {
		String carName = "car1";
		Car car = new Car(carName);

		assertThat(car.getName()).isEqualTo(carName);
	}
}

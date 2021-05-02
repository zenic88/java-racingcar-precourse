package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void validationTest() {

		assertThatIllegalArgumentException().isThrownBy(() -> new Cars("car1"))
			.withMessage("레이싱을 할 차량이 2대 이상 필요합니다.");
	}

	@Test
	void createCarsTest() {
		Cars cars = new Cars("car1,car2");

		assertThat(cars.getSize()).isEqualTo(2);
	}
}

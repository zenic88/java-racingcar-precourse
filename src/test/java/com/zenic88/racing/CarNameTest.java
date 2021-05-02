package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

	@Test
	@DisplayName("자동차 이름 길이 테스트")
	void carNameLengthTest() {
		assertThatIllegalArgumentException().isThrownBy(() -> new CarName("invalid_name"))
			.withMessage("이름은 빈칸을 제외한 5자 이하로 지정해주세요.");
	}

	@Test
	@DisplayName("자동차 이름 빈 값 테스트")
	void carNameBlankTest() {
		assertThatIllegalArgumentException().isThrownBy(() -> new CarName("  "))
			.withMessage("이름은 빈칸을 제외한 5자 이하로 지정해주세요.");
	}

	@Test
	@DisplayName("자동차 이름 null 값 테스트")
	void carNameNullTest() {
		assertThatIllegalArgumentException().isThrownBy(() -> new CarName(null))
			.withMessage("이름은 필수값입니다.");
	}

	@Test
	@DisplayName("자동차 이름 객체 생성 테스트")
	void createCarNameTest() {
		String name = "car1";
		CarName carName = new CarName(name);

		assertThat(carName.getName()).isEqualTo("car1");
	}
}

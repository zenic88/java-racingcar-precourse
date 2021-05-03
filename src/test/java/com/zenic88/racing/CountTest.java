package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CountTest {

	@Test
	void validTest() {
		assertThatThrownBy(() -> new Count("test")).isInstanceOf(NumberFormatException.class)
			.hasMessageContaining("숫자만 입력 가능합니다. 입력값 :");
	}

	@Test
	void createTest() {
		Count count = new Count("2");

		assertThat(count.getCount()).isEqualTo(2);
	}
}

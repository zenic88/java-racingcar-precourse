package com.zenic88.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

	@Test
	@DisplayName("포지션 이동 테스트")
	void movePositionTest() {
		Position position = new Position();
		position.move();

		assertThat(position.getPosition()).isEqualTo(1);
	}

	@Test
	@DisplayName("포지션 생성 테스트")
	void createPositionTest() {
		Position position = new Position();

		assertThat(position.getPosition()).isEqualTo(0);
	}
}

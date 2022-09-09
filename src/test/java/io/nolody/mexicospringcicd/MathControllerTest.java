package io.nolody.mexicospringcicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTest {
	@Autowired
	private MathController controller;

	@Test
	public void rectangleAreaReturnsCorrectArea() {
		int result = controller.rectangleArea(2, 4);
		assertEquals(8, result);
	}

	@Test
	public void circleRadiusReturnsCorrectArea() {
		double result = controller.circleRadius(2.0);
		assertEquals(12.566, result, 0.01);
	}
}

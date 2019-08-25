
package pl.sokolow.testtask.prevapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class SquareCounterTest {
	private double PRECISION = 1e-12;

	@Test
	public void testCounter() {
		
		assertEquals(Double.valueOf(100), countResult(Double.valueOf(10)), PRECISION);
		assertEquals(Double.valueOf(4.84), countResult(Double.valueOf(2.2)), PRECISION);
	}

	@Test(expected = IllegalArgumentException.class)
	public void CounterExceptionTestZero() {
		countResult(Double.valueOf(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CounterExceptionTestNegative(){
		Double side;
		
		side = Double.valueOf(-2);
		SquareCounter.count(side);
	}

	private Double countResult(Double d) {
		return SquareCounter.count(d).get();
	}
}
